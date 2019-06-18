package com.linewebhook.service;

public class Status {

	private int code;
	private String message;
	public int getCode() {
		return code;
	}
	
	public Status(int code, String message) {
		super();
		this.code = code;
		this.message = message;
	}

	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
