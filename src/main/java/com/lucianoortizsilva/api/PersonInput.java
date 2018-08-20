package com.lucianoortizsilva.api;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 
 * @author lucianoortizsilva@gmail.com
 * @since 2018/08/20
 *
 */
@Getter
@Setter
@ToString
public class PersonInput implements Serializable {

	private static final long serialVersionUID = 7937454393886012114L;

	private String firstname;
	private String lastname;
	private Integer age;

}