package org.ssglobal.training.codes.a;

@SuppressWarnings("serial")
public class ElementDecimalException extends Exception {

	private String message = "Invalid element value";
	
	public ElementDecimalException() {
		
	}
	
	public ElementDecimalException(String message) {
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
