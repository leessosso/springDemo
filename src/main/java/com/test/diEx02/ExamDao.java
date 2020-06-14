package com.test.diEx02;

public class ExamDao {
	private String msg;
	
	public ExamDao() {
	} //기본 생성자
	
	public ExamDao(String msg) {
		this.msg = msg;
	} //인자 생성자
	
	public void outputMsg() {
		System.out.println("msg: " + msg);
	}
	
}
