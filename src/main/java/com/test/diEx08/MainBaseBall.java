package com.test.diEx08;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainBaseBall {

	public static void main(String[] args) {
		
		//AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigApp.class);
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:baseBall3.xml");
		
		Player player1 = ctx.getBean("player1", Player.class);
		System.out.println(player1.getName());
		System.out.println(player1.getPosition());
		System.out.println(player1.getHeight());
		System.out.println(player1.getWeight());
		
		System.out.println("================================");
		
		Player player2 = ctx.getBean("player2", Player.class);
		System.out.println(player2.getName());
		System.out.println(player2.getPosition());
		System.out.println(player2.getHeight());
		System.out.println(player2.getWeight());
	
	}

}
