package org.ssglobal.training.codes.a;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TrayArray {

	private Scanner scan = new Scanner(System.in);
	
	// STEP 1A:	Create Logger
	private static Logger logger = LogManager.getLogger( "trapCollector" );

	
	public void arrayTransact() 
		   throws LetterSizeException, InvalidSizeException, 
		   		  ElementCharException, ElementDecimalException,
		   		  BadIndexException, NumberFormatException, Exception {
		String input;
		int size;
		
		while (true) {
			
			
			System.out.print("Enter the Array Size: ");
			input = scan.nextLine();
			
			if (input.equalsIgnoreCase("E")) {
				logger.info("Exiting method...");
				break;
			}
			
			try {
				size = Integer.parseInt(input);
				if (size < 0) {
					InvalidSizeException e1 = new InvalidSizeException();
					logger.fatal( e1.getMessage() );	
					throw e1;
				}
			} catch (NumberFormatException e) {
				logger.fatal( e.getMessage() );	
				throw e;
			}
		}	
		
		scan.close();
	}
	
}
