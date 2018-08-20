package com.lucianoortizsilva.graphql;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.lucianoortizsilva.api.Person;
import com.lucianoortizsilva.api.PersonRepository;

/**
 * 
 * @author lucianoortizsilva@gmail.com
 * @since 2018/08/20
 *
 */
public class Query implements GraphQLQueryResolver {

	private final PersonRepository personRepository;

	public Query(final PersonRepository personRepository) {
		this.personRepository = personRepository;
	}

	public static Query of(final PersonRepository personRepository) {
		return new Query(personRepository);
	}

	public List<Person> allPersons() {
		return this.personRepository.findAll();
	}
}