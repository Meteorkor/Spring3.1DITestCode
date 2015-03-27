package com.meteor.app.model;

public class ConnectionUtil {

	String url;
	public ConnectionUtil(){
		
	}
	
	public void showUrl(){
		System.out.println( "showUrl() : " + this.url );
		
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	
	
	
}
