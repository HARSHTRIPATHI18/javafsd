package com.app.exception;

public class FileNameNotFoundException extends Throwable{
	public FileNameNotFoundException() {
		super();
	}
	
	public FileNameNotFoundException(String message) {
		super(message + " not found");
	}
}
