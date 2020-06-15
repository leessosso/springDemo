package com.test.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class AdviceLog {
	
	//proceedingJoinPint 객체는 원래 실행되어야 할 대상 메소드(핵심 기능)
	public Object profile(ProceedingJoinPoint joinPoint) throws Throwable{
		String singStr = joinPoint.getSignature().toShortString();
		
		System.out.println(singStr + " is start!!");
		
		long startTime = System.currentTimeMillis();
		
		try {
			Object obj = joinPoint.proceed();
			
			return obj;
		} finally {
			long endTime =  System.currentTimeMillis();
			
			System.out.println(singStr + " is finished!!");
			System.out.println(singStr + " 경과 시간 : " + (endTime - startTime));
		}
		
	}

}
