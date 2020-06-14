package com.test.ex04;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

public class EnvironmentEx implements EnvironmentAware, InitializingBean, DisposableBean{
	
	private Environment env;
	private String id;
	private String pwd;


	@Override
	public void setEnvironment(Environment env) {
		System.out.println("setEnvironment() ȣ��");
		this.env = env;
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet() ȣ��");
		setId(env.getProperty("env.id"));
		setPwd(env.getProperty("env.pwd"));
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy() ȣ��");

	}
	
	//setter, getter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
}
