package com.test.diEx07;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainBaseBall {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigApp.class);
		
		Player player1 = ctx.getBean("player1", Player.class);
		System.out.println(player1.getName());
		System.out.println(player1.getPosition());
		System.out.println(player1.getHeight());
		System.out.println(player1.getWeight());
	
	}

}
