package com.test.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class AdviceLog {
	
	//proceedingJoinPint ��ü�� ���� ����Ǿ�� �� ��� �޼ҵ�(�ٽ� ���)
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
			System.out.println(singStr + " ��� �ð� : " + (endTime - startTime));
		}
		
	}

}
