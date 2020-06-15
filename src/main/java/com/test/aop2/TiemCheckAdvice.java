package com.test.aop2;

import org.aspectj.lang.ProceedingJoinPoint;

//���޼ҵ带 ������ �� �ִ� ����� ���� proceedingJoinPoint�� ���� �޴´�.
public class TiemCheckAdvice {
	public Object check(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("method start....");
		
		Object returnValue = joinPoint.proceed();
		
		System.out.println("method end....");
		
		//���޼ҵ��� ������ ����� ��ȯ���� ��ȯ �ؾ��Ѵ�.
		return returnValue;
	}
}
