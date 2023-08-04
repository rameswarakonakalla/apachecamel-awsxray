package com.entity;

public class ResponseType {

	private String message;

	
	public ResponseType() {
	}

	public ResponseType(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "message=" + getMessage();
	}
	
}
