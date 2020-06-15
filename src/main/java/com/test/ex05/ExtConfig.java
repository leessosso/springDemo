package com.test.ex05;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@Configuration
public class ExtConfig {
	
	@Value("${env.id}")
	private String envId;
	@Value("${env.pwd}")
	private String envPwd;
	@Value("${ext.id}")
	private String extId;
	@Value("${ext.pwd}")
	private String extPwd;
	
	@Bean //�����̳ʿ��� ȣ���ؼ� ����ϴ� �޼ҵ� 
	public static PropertySourcesPlaceholderConfigurer Properties() {
		
		//������Ƽ ������ ��ġ���� �����ϴ� ��ü
		PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
		
		Resource[] locations = new Resource[2];
		locations[0] = new ClassPathResource("env.properties");
		locations[1] = new ClassPathResource("external.properties");
		configurer.setLocations(locations);
		
		return configurer;
	}//Properties()

	@Bean
	public ExternalFileEx extConf() {
		ExternalFileEx ext = new ExternalFileEx();
		ext.setId(envId);
		ext.setPwd(envPwd);
		ext.setExtId(extId);
		ext.setExtPwd(extPwd);
		
		return ext;
	}//extConfig()

}
