package com.test.ex03;

import org.springframework.beans.factory.BeanNameAware;

public class LifeBeanImpl implements LifeBean, BeanNameAware{
	
	private String beanName; //�������Ͽ���  bean�� id�� �����ϱ� ���� ����

	
	public void init() {
		System.out.println("����� �ʱ�ȭ �޼ҵ�");
	}
	
	public void end() {
		System.out.println("����� �Ҹ� �޼ҵ�");
	}

	@Override
	public void lifeMethod() {
		System.out.println("����Ͻ� ������ �����մϴ�!!!");
		System.out.println("beanName : " + beanName);
	}
	
	//��ü�� �ڽ��� �̸��� �˾ƾ� �ϴ� ��� ����ϴ� �޼ҵ�(��ü�� ������ �� �ش� ��ü�� id���� ���� �޴� �޼ҵ�)
	@Override
	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}

}
