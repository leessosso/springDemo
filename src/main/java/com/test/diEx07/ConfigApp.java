package com.test.diEx07;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigApp {
	
	@Bean
	public Player player1() {
		ArrayList<String> position = new ArrayList<String>();
		position.add("4��Ÿ��");
		position.add("3���");
		
		Player player = new Player("�ں�ȣ", 28, position);
		player.setHeight(187);
		player.setWeight(90);
		
		return player;
	}
		
	@Bean
	public Player player2() {
		ArrayList<String> position = new ArrayList<String>();
		position.add("3��Ÿ��");
		position.add("���ݼ�");
		
		Player player = new Player("�ս���", 39, position);
		player.setHeight(185);
		player.setWeight(77);
		
		return player;
		
	}
}
