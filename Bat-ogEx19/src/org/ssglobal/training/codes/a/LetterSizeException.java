package org.ssglobal.training.codes.a;

@SuppressWarnings("serial")
public class LetterSizeException  extends Exception {

	private String message = "Invalid size";
	
	public LetterSizeException() {
		
	}
	
	public LetterSizeException(String message) {
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
