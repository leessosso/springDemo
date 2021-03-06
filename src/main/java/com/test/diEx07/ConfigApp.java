package com.test.diEx07;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigApp {
	
	@Bean
	public Player player1() {
		ArrayList<String> position = new ArrayList<String>();
		position.add("4번타자");
		position.add("3루수");
		
		Player player = new Player("박병호", 28, position);
		player.setHeight(187);
		player.setWeight(90);
		
		return player;
	}
		
	@Bean
	public Player player2() {
		ArrayList<String> position = new ArrayList<String>();
		position.add("3번타자");
		position.add("유격수");
		
		Player player = new Player("손시헌", 39, position);
		player.setHeight(185);
		player.setWeight(77);
		
		return player;
		
	}
}
