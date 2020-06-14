package com.test.diEx03;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainPerson {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:Person.xml");
		
		//�����ڸ� Ȱ���ؼ� ���
		PersonInfo personInfo = ctx.getBean("personInfo", PersonInfo.class);
		personInfo.getPersonInfo();
		
		//������ ���� person��ü�� �����ؼ� ���
		Person person = ctx.getBean("person1", Person.class);
		personInfo.setPerson(person);
		personInfo.getPersonInfo();
		
		ctx.close();
		
	}

}
