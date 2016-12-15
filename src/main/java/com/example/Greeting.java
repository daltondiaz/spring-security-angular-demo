package com.example;

import java.util.UUID;

public class Greeting {

	
	private String id = UUID.randomUUID().toString();
	private String msg;
	
	public Greeting(String msg){
		this.msg = msg;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
}
