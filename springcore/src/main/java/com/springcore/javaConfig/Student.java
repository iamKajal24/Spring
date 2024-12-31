package com.springcore.javaConfig;

import org.springframework.stereotype.Component;

//@Component("FirstStudent")
public class Student {

	private Samosa samosa;

	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}

	public Student() {
		super();
	}

	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}
	public void study() {
		System.out.println("Student is reading book...");
		this.samosa.display();
	}

}
