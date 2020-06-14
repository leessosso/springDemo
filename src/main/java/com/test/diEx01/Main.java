package com.test.diEx01;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//������ �̷��� �ߴµ� (���������� ������� �ʾ��� �� )
		/*
		 * MyGetSum myGetSum = new MyGetSum();
		 * 
		 * myGetSum.setGetsum(new GetSum());
		 * 
		 * myGetSum.setA(10); myGetSum.setB(100);
		 * 
		 * myGetSum.sum();
		 */		
		
		//������������
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:getsum.xml");
		
		MyGetSum myGetSum = ctx.getBean("mygetsum", MyGetSum.class);
		
		myGetSum.sum();
		
	}

}
