package com.test.aop2;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;

public class loggingAdvice {
	//모든 비지니스 로직 메소드가 가지는 공통기능 구현
	//Spring으로부터 method, target, 매개변수 등의 정보를 가진 JoinPoint 객체를 전달 받는다.
	//즉, 매개변수만 선언 해놓으면 가져다 사용할 수 있다.
	public void logging(JoinPoint joinpoint) {
		Signature method = joinpoint.getSignature();

		String methodName = method.getName();
		System.out.println("methodName : " + methodName);
	}
	
}
