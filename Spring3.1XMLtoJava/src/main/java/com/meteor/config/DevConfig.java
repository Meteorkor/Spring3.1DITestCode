package com.meteor.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import com.meteor.app.model.ConnectionUtil;
import com.meteor.app.model.Worker;

//@ImportResource("classpath:com/meteor/app/test-context.xml")
@Configuration
public class DevConfig {
/**/	
	@Bean
	public Worker getWorker(){
		return new Worker();
	}
	
	@Bean
	public ConnectionUtil getConnectionUtill(){
		ConnectionUtil connUtill = new ConnectionUtil();
		connUtill.setUrl("Default URL");
	
		
		return connUtill;
	}

}
