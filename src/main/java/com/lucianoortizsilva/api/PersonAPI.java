package com.lucianoortizsilva.api;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import java.net.URI;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;

/**
 * 
 * @author lucianoortizsilva@gmail.com
 * @since 2018/08/20
 *
 */
@RestController
@RequestMapping(path = "/api/v1/persons")
public class PersonAPI {

	@Autowired
	private PersonRepository personRepository;

	@PostMapping(consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> create(@Valid @RequestBody(required = true) final PersonInput request,final Errors errors) {
		
		if (errors.hasErrors()) 
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		
		final Person person = new Person(request.getFirstname(), request.getLastname(), request.getAge());
		this.personRepository.save(person);
		final URI uri = MvcUriComponentsBuilder.fromController(getClass()).path("/{id}").buildAndExpand(person.getId()).toUri();
		return ResponseEntity.status(HttpStatus.CREATED).location(uri).build();
	}
	
}