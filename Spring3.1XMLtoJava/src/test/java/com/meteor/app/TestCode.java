package com.meteor.app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.meteor.app.model.ConnectionUtil;
import com.meteor.app.model.Worker;
import com.meteor.config.DevConfig;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations="test-context.xml")
@ContextConfiguration(classes=DevConfig.class)
public class TestCode {

	@Autowired
	Worker worker;
	
	@Autowired
	ConnectionUtil connUtil;
	
	
	@Test
	public void workerRun(){
		
		worker.test();
		
		connUtil.showUrl();
		
		
	}
	
}
