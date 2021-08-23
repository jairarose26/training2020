package org.ssglobal.training.codes.a;

@SuppressWarnings("serial")
public class InvalidSizeException  extends Exception {

	private String message = "Array size cannot be negative";
	
	public InvalidSizeException() {
		
	}
	
	public InvalidSizeException(String message) {
		
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
