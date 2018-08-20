package com.lucianoortizsilva.api;

import java.io.Serializable;

/**
 * 
 * @author lucianoortizsilva@gmail.com
 * @since 2018/08/20
 *
 */
public class PersonInput implements Serializable {

	private static final long serialVersionUID = 7937454393886012114L;

	private String firstname;
	private String lastname;
	private Integer age;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public Integer getAge() {
		return age;
	}

}