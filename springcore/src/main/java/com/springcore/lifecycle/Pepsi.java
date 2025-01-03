package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean {
	private double price;

	public Pepsi(double price) {
		super();
		this.price = price;
	}

	public Pepsi() {
		super();
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// init
		System.out.println("taking pepsi :init");
	}

	@Override
	public void destroy() throws Exception {
		// destroy
		System.out.println("Going to put bottle back to shop after drinking : to destroy");

	}

}
