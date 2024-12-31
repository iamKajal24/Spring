package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class Student {
	@Value("kajal")
	private String name;
	@Value("Haridwar")
	private String city;
	@Value("9638554498")
	private String phone;
	@Value("#{temp}")
	private List<String> address;

	public Student() {
		super();
	}

	public Student(String name, String city, String phone) {
		super();
		this.name = name;
		this.city = city;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	

	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + ", phone=" + phone + "]";
	}
}
