package com.eflu.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.eflu.config.AppConfig;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("Before getBean method");
		Person person = context.getBean("myPerson", Person.class);
		System.out.println(person.getName());
		System.out.println(person.getLastName());

		((AnnotationConfigApplicationContext) context).close();
	}

}
