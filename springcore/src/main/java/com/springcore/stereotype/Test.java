package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/Config.xml");

		Student student = context.getBean("student", Student.class);
//		System.out.println(student);
//		System.out.println(student.getAddress());
//		System.out.println(student.getAddress().getClass().getName());
    
		
		System.out.println("singleton scope");
		System.out.println(student.hashCode());
		
		Student student1 = context.getBean("student", Student.class);
		System.out.println(student1.hashCode());
		
		//
		System.out.println("******************************************");
		System.out.println("prototype scope");
		
		 Teacher teacher =context.getBean("teacher", Teacher.class);
		 System.out.println(teacher.hashCode());
		 
		 Teacher teacher1 =context.getBean("teacher", Teacher.class);
		 System.out.println(teacher1.hashCode());
		 
		 Teacher teacher2 =context.getBean("teacher", Teacher.class);
		 System.out.println(teacher2.hashCode());
	}
}
