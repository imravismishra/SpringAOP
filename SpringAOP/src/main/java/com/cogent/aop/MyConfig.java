package com.cogent.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class MyConfig {

	@Bean
	public Operation opt() {
		return new Operation();
	}

	@Bean
	public TrackOperation topt() {
		return new TrackOperation();
	}

}
