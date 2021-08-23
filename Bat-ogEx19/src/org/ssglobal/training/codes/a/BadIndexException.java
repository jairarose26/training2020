package org.ssglobal.training.codes.a;

@SuppressWarnings("serial")
public class BadIndexException extends Exception {

	private String message = "Bad Index";
	
	public BadIndexException() {
		
	}
	
	public BadIndexException(String message) {
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		return message;
	}
	
	@Override
	public void printStackTrace() {
		System.err.println(message);
	}	
	
}