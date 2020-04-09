package com.eflu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.eflu.annotations.Person;

//It is like beans.xml where I can put all my beans.
@Configuration
public class AppConfig {

	@Bean
	public Person myPerson() {
		return new Person();
	}

}
