package com.test.aop2;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;

public class loggingAdvice {
	//��� �����Ͻ� ���� �޼ҵ尡 ������ ������ ����
	//Spring���κ��� method, target, �Ű����� ���� ������ ���� JoinPoint ��ü�� ���� �޴´�.
	//��, �Ű������� ���� �س����� ������ ����� �� �ִ�.
	public void logging(JoinPoint joinpoint) {
		Signature method = joinpoint.getSignature();

		String methodName = method.getName();
		System.out.println("methodName : " + methodName);
	}
	
}
