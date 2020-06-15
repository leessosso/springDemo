package com.test.ex06;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainProfile2 {

	public static void main(String[] args) {
		String profile = null;
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		
		if(str.equals("develop")) {
			profile = "develop";
		}else if(str.equals("service")) {
			profile = "service";
		}
		
		scanner.close();
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.getEnvironment().setActiveProfiles(profile); //설정파일을 결정
		ctx.register(Devconfig.class, SvcConfig.class);
		ctx.refresh();
		
		profileEx prof = ctx.getBean("profileEx", profileEx.class);
		System.out.println("ip : " + prof.getIp());
		System.out.println("port : " + prof.getPort());
		
		ctx.close();

	}

}
