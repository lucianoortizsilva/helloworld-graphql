package com.lucianoortizsilva.config;

import javax.annotation.Resource;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.lucianoortizsilva.api.PersonRepository;
import com.lucianoortizsilva.web.GraphQLEntryPoint;

/**
 * 
 * @author lucianoortizsilva@gmail.com
 * @since 2018/08/20
 *
 */
@Configuration
public class ConfigurationGraphQL {

	@Resource
	private PersonRepository personRepository;

	@Bean
	public ServletRegistrationBean graphQLServlet() {
		final GraphQLEntryPoint graphQLEntryPoint = GraphQLEntryPoint.of(this.personRepository);
		return new ServletRegistrationBean(graphQLEntryPoint, "/graphql");
	}

}