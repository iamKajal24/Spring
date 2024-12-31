package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		System.out.println("Spring Core Application Starting...");

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/config.xml");

		// Retrieving the bean with ID "student1" from the Spring container
		Student student1 = (Student) context.getBean("student1");
		Student student2 = (Student) context.getBean("student2");

		System.out.println(student1);
		System.out.println(student2);
	}
}
