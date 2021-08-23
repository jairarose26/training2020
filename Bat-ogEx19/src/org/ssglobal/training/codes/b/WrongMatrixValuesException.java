package org.ssglobal.training.codes.c;

public class WrongMatrixValuesException extends Exception {

	private String message = "WrongMatrixValueException: not convertible to integer";
	
	public WrongMatrixValuesException() {
		
	}
	
	public WrongMatrixValuesException(String message) {
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
