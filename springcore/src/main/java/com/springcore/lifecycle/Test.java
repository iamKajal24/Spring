package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		System.out.println("project started...");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/Config.xml");
		context.registerShutdownHook();
		
//		Samosa samosa = (Samosa) context.getBean("s1");
//		System.out.println(samosa);
		
		//registerShutdownhook();
		//context.registerShutdownHook();
		
		
//		System.out.println("***************************************");
		
//		Pepsi pepsi = (Pepsi) context.getBean("p1");
//		System.out.println(pepsi);
//		
//		System.out.println("***************************************");
		Example example = (Example) context.getBean("e1");
		System.out.println(example);
	}
}
