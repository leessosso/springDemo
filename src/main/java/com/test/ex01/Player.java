package com.test.ex01;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Player implements InitializingBean, DisposableBean{
	private String name;
	private int age;
	
	public Player() {} //�⺻ ������

	public Player(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("���� ������ ó���� ��ɵ�~~~");
		
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("���� �Ҹ�� ó���� ��ɵ�~~~");
		
	}
}
