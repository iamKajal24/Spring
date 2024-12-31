package com.springcore.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		System.out.println("project started...");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/reference/refConfig.xml");
		A1 temp = (A1) context.getBean("Aref");
		System.out.println(temp);
		System.out.println(temp.getX());
		System.out.println(temp.getOb().getY());
	}
}
