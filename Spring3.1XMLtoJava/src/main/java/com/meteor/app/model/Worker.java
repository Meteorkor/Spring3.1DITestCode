package com.meteor.app.model;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

@Service
public class Worker {

	public void test(){
		System.out.println("test run");
	}
	
	
	@PostConstruct
	public void postConstruct(){
		System.out.println( "postConstruct() run" );
		
	} 
	
}
