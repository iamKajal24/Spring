package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	
	private Address address;
	
	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("inside construtor...");
	}

	public Address getAddress() {
		return address;
	}
	@Autowired
	@Qualifier("address2")  // qualifier isliye use karte hai ki kis bean ko execute karna 
	public void setAddress(Address address) {
		System.out.println("setting values...");
		this.address = address;
	}

	public Emp() {
		super();
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

}
