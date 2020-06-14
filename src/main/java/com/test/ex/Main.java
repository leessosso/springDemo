package com.test.ex;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		
		ctx.load("classpath:baseBall4_1.xml");
		ctx.refresh();
		
		ctx.close();
		
	}

}
