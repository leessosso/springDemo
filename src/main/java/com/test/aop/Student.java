package com.test.aop;

public class Student {
	private String name;
	private String hakbun;
	private String age;
	private String grade;
	
	//setter, getter
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getHakbun() {
		return hakbun;
	}


	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public String getGrade() {
		return grade;
	}


	public void setGrade(String grade) {
		this.grade = grade;
	}

	//�л����� ������
	public void getInfo() {
		System.out.println("�̸� : " + getName());
		System.out.println("�й� : " + getHakbun());
		System.out.println("���� : " + getAge());
		System.out.println("�г� : " + getGrade());
	}
	
	
}
