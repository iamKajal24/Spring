package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/Springcore/collections/CollectionConfig.xml");
		Emp emp = (Emp) context.getBean("emp1");
		
		//System.out.println(emp);
		
		System.out.println(emp.getName());
		System.out.println(emp.getPhone());
		System.out.println(emp.getCourse());
		System.out.println(emp.getAddresses());
		System.out.println(emp.getProps());
		
		// kis package mei hai ese dekh sakte hai
//		System.out.println(emp.getPhone().getClass().getName());
//		System.out.println(emp.getAddresses().getClass().getName());
//		System.out.println(emp.getCourse().getClass().getName());
		
	}
}
