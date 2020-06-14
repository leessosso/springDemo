package com.test.diEx01;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//원래는 이렇게 했는데 (설정파일을 사용하지 않았을 때 )
		/*
		 * MyGetSum myGetSum = new MyGetSum();
		 * 
		 * myGetSum.setGetsum(new GetSum());
		 * 
		 * myGetSum.setA(10); myGetSum.setB(100);
		 * 
		 * myGetSum.sum();
		 */		
		
		//스프링에서는
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:getsum.xml");
		
		MyGetSum myGetSum = ctx.getBean("mygetsum", MyGetSum.class);
		
		myGetSum.sum();
		
	}

}
