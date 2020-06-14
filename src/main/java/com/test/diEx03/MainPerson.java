package com.test.diEx03;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainPerson {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:Person.xml");
		
		//생성자를 활용해서 출력
		PersonInfo personInfo = ctx.getBean("personInfo", PersonInfo.class);
		personInfo.getPersonInfo();
		
		//생성자 이후 person객체를 주입해서 출력
		Person person = ctx.getBean("person1", Person.class);
		personInfo.setPerson(person);
		personInfo.getPersonInfo();
		
		ctx.close();
		
	}

}
