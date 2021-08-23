package org.ssglobal.training.codes.c;

public class TestMixTransaction {

	public static void main(String[] args) {
		String dir = new String("./src/files/");
		String filename;		
		
		MixTransaction mt = new MixTransaction();
		
		// Scenario 1: No error Matrix
		System.out.println("===== Scenario 1:");
		filename = new String(dir + "matrixA3x3.txt");		
		try {
			mt.convertMatrix(filename);
		} catch (WrongMatrixDimensionException e) {
			e.printStackTrace();
		} catch (WrongMatrixValuesException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// Scenario 2: No error Matrix
		System.out.println("===== Scenario 2:");
		filename = new String(dir + "matrixB3x3.txt");		
		try {
			mt.convertMatrix(filename);
		} catch (WrongMatrixDimensionException e) {
			e.printStackTrace();
		} catch (WrongMatrixValuesException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// Scenario 3: WrongMatrixDimensionException
		System.out.println("===== Scenario 3: Dimension Exception");
		filename = new String(dir + "matrixDimensionEx.txt");		
		try {
			mt.convertMatrix(filename);
		} catch (WrongMatrixDimensionException e) {
			e.printStackTrace();
		} catch (WrongMatrixValuesException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// Scenario 4: WrongMatrixDimensionException
		System.out.println("===== Scenario 3: Values Exception");
		filename = new String(dir + "matrixValueEx.txt");		
		try {
			mt.convertMatrix(filename);
		} catch (WrongMatrixDimensionException e) {
			e.printStackTrace();
		} catch (WrongMatrixValuesException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// Scenario 4: WrongMatrixDimensionException
		System.out.println("===== Scenario 5: Empty File");
		filename = new String(dir + "empty.txt");		
		try {
			mt.convertMatrix(filename);
		} catch (WrongMatrixDimensionException e) {
			e.printStackTrace();
		} catch (WrongMatrixValuesException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// Scenario 6: No file
		System.out.println("===== Scenario 6:");
		filename = new String(dir + "hello.txt");		
		try {
			mt.convertMatrix(filename);
		} catch (WrongMatrixDimensionException e) {
			e.printStackTrace();
		} catch (WrongMatrixValuesException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
