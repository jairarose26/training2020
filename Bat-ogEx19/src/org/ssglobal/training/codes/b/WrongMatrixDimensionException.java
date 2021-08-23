package org.ssglobal.training.codes.c;

public class WrongMatrixDimensionException extends Exception {

private String message = "WrongMatrixDimensionException: not enough to build 3 x 3 matrix";
	
	public WrongMatrixDimensionException() {
		
	}
	
	public WrongMatrixDimensionException(String message) {
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
