package com.eflu.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component // It is used to denote that it is a Bean.
public class Person {

	@Value("Edgar") // Value by default
	private String name;
	@Value("Lizarraga") // Value by default
	private String lastName;

	public Person(){
		System.out.println("Person");
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
