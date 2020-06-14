package com.test.diEx06;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainBaseBall {

	public static void main(String[] args) {
		String confLoc = "classpath:baseball1.xml";
		String confLoc2 = "classpath:baseball2.xml";
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(confLoc, confLoc2);
		
		Player player1 = ctx.getBean("player1",Player.class);
		System.out.println(player1.getName());
		System.out.println(player1.getPosition());
		
		PlayerInfo playerInfo = ctx.getBean("playerInfo1", PlayerInfo.class);
		Player player2 = playerInfo.getPlayer();
		System.out.println(player2.getName());
		System.out.println(player2.getPosition());
		
		if(player1.equals(player2)) {
			System.out.println("player1�� player2�� ���� �����Դϴ�!!!");
		}
		
		Player player3 = ctx.getBean("player3",Player.class);
		System.out.println(player3.getName());
		System.out.println(player3.getPosition());
		
		BaseBallTeam baseBallTeam = ctx.getBean("baseBallTeam", BaseBallTeam.class);
		System.out.println("=================================="); 
		System.out.println("����: " + baseBallTeam.getManager()); 
		System.out.println("Ÿ����ġ: " + baseBallTeam.getBattingCoach()); 
		System.out.println("������ġ: " + baseBallTeam.getPitchingCoach()); 
		System.out.println("Ÿ��: " + baseBallTeam.getHitter()); 
		System.out.println("����: " + baseBallTeam.getPitcher());
		
		ctx.close();
	}

}
