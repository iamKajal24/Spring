package com.springcore.reference;

public class A1 {
	private int x;
	private B ob;

	public A1() {
		super();
	}

	public A1(int x, B ob) {
		super();
		this.x = x;
		this.ob = ob;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public B getOb() {
		return ob;
	}

	public void setOb(B ob) {
		this.ob = ob;
	}

	@Override
	public String toString() {
		return "A1 [x=" + x + ", ob=" + ob + "]";
	}

}
