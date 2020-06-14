package com.test.diEx01;

public class MyGetSum {
	GetSum getsum;
	private int a;
	private int b;
	
	public MyGetSum() {
	}
	
	public void sum() {
		getsum.sum(a, b);
	}

	public GetSum getGetsum() {
		return getsum;
	}

	public void setGetsum(GetSum getsum) {
		this.getsum = getsum;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	

}
