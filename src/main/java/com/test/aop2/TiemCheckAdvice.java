package com.test.aop2;

import org.aspectj.lang.ProceedingJoinPoint;

//대상메소드를 실행할 수 있는 기능을 가진 proceedingJoinPoint를 전달 받는다.
public class TiemCheckAdvice {
	public Object check(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("method start....");
		
		Object returnValue = joinPoint.proceed();
		
		System.out.println("method end....");
		
		//대상메소드의 실행결과 얻어진 반환값을 반환 해야한다.
		return returnValue;
	}
}
