package com.test.diEx01;

public class GetSum {
	private int aa;
	private int bb;
	
	public int getAa() {
		return aa;
	}
	public void setAa(int aa) {
		this.aa = aa;
	}
	public int getBb() {
		return bb;
	}
	public void setBb(int bb) {
		this.bb = bb;
	}
	
	public void sum(int aa, int bb) {
		System.out.println("���ϱ�");
		int result = aa + bb;
		System.out.println("�� : " + result);
	}
	
}
