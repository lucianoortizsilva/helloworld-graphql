package com.lucianoortizsilva.web;

import com.coxautodev.graphql.tools.SchemaParser;
import com.lucianoortizsilva.api.Person;
import com.lucianoortizsilva.api.PersonRepository;
import com.lucianoortizsilva.graphql.Query;

import graphql.schema.GraphQLSchema;
import graphql.servlet.SimpleGraphQLServlet;

/**
 * 
 * @author lucianoortizsilva@gmail.com
 * @since 2018/08/20
 *
 */
public class GraphQLEntryPoint extends SimpleGraphQLServlet {

	private static final long serialVersionUID = -77597284281296048L;

	private static final String FILE_GRAPHSQL = "schema.graphqls";

	public GraphQLEntryPoint(GraphQLSchema schema) {
		super(schema);
	}

	public static GraphQLEntryPoint of(final PersonRepository personRepository) {
		return new GraphQLEntryPoint(buildSchema(personRepository));
	}

	private static GraphQLSchema buildSchema(final PersonRepository personRepository) {
		return SchemaParser.newParser()//
				.file(FILE_GRAPHSQL)//
				.dictionary(Person.class)//
				.resolvers(Query.of(personRepository))//
				.build()//
				.makeExecutableSchema();//
	}

}