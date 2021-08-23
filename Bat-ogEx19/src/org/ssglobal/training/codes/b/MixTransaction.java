package org.ssglobal.training.codes.c;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;

public class MixTransaction {

	private static boolean fileExist(String filename) {
		File file = new File(filename);
		return file.exists();
	}
	 
	private static boolean isInt(String strVal) {
		try {
			Integer.parseInt(strVal);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
	
	private static boolean isDouble(String strVal) {
		try {
			Double.parseDouble(strVal);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
	
	public int[][] convertMatrix(String filename)
		   throws WrongMatrixDimensionException, WrongMatrixValuesException, Exception {
		
		int[][] matrix = new int[3][3];
		
		int count = 0, 
			token = 0; 
		if ( fileExist(filename) ) {
			File file = new File(filename);
			String[] elements = new String[(int) file.length()];
			
			try {
				FileReader fr = new FileReader(file);
				StreamTokenizer tokenizer = new StreamTokenizer(fr);
				
				while ( !(token == StreamTokenizer.TT_EOF) ) {					
					
					if (token == StreamTokenizer.TT_WORD) {
						elements[count] = tokenizer.sval;	
						count++;
					} else if (token == StreamTokenizer.TT_NUMBER) {
						elements[count] = Double.toString(tokenizer.nval);	
						count++;
					}	
					
					token = tokenizer.nextToken();
				}			
				
				fr.close();					
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			if (count < 9) {
				throw new WrongMatrixDimensionException();
			}			
			
			int index = 0;
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length; j++) {
				
					if ( isInt(elements[index]) ) {						
						matrix[i][j] = Integer.parseInt(elements[index]);
						index++;
					} else if ( isDouble(elements[index]) ) {
						matrix[i][j] = (int) Double.parseDouble(elements[index]);
						index++;
					} else {
						throw new WrongMatrixValuesException();
					}
					
				}
			}
			
			// For Testing: Display Output
			displayMatrix(matrix);
		} else {
			System.out.println("File not Exist!");
		}
		
		
		
		return matrix;
	}

	private void displayMatrix(int[][] matrix) {
		System.out.println("=== Matrix:");
		for ( int i = 0; i < matrix.length; i++ ) {
			for ( int j = 0; j < matrix[i].length; j++ ) {
				System.out.print("[\t" + matrix[i][j] + "\t]");
			}
			System.out.println();
		}
	}
	
}
