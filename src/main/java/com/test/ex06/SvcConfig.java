package com.test.ex06;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("service")
public class SvcConfig {
	@Bean
	public profileEx profileEx() {
		profileEx prof = new profileEx();
		prof.setIp("321.156.452.15");
		prof.setPort("82");
		
		return prof;
	}
}
