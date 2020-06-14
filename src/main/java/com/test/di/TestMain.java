package com.test.di;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		
		String confLoc = "classpath:test.xml";
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(confLoc);
		
		TestDAO testDao = ctx.getBean("TestDAOImp", TestDAOImp.class);
		
		System.out.println("================");
		//TestDAO testDao = new TestDAO(); �ڵ带 ������� �ʾ������� �ұ��ϰ�
		testDao.printMsg();
		System.out.println("================");

	}
}
