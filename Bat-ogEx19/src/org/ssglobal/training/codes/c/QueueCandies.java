package org.ssglobal.training.codes.c;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Queue;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class QueueCandies {
	
	// STEP 1A:	Create Logger
	private static Logger logger = LogManager.getLogger( "collectionLogger" );

	public void getCandy(Queue<Candy> dispenser, int day) throws NullPointerException, Exception {
		logger.info("Executing getCandy() method...");
		
		int count = day;
		
		try {
			if ( ( !dispenser.isEmpty() )&& (day >= 0 && day < 7) ) {
				
	
				//System.out.println("Initial Dispenser");	
				logger.info("Initial Dispenser: ");		
				displayQueue(dispenser);
				
				while ( !dispenser.isEmpty() ) {
					
					String eat = dispenser.poll().getFlavor();
					System.out.println("Eating " + eat + "...");
					logger.info( "Eating " + eat );		
					
					// Transfer Candies
					if (!dispenser.isEmpty()) {
						for (int i = 0; i < count; i++) {
							try {						
								Candy get = dispenser.poll();
								dispenser.offer(get);
							} catch (ClassCastException e) {
	
							} catch (UnsupportedOperationException e) {
							
							} catch (IllegalArgumentException e) {
							
							}
						}
					} else {
						logger.info("Dispenser is Empty");	
					}
					
					System.out.print("\t");
					displayQueue(dispenser);
					
				}
				logger.info("Exiting QueueCandies class...");	
	
			} else {
				// System.out.println("Invalid Inputs!");
				logger.error("Invalid Inputs! Exiting getCandy() method from QueueCandies class...");	
			}
		} catch (NullPointerException e) {
			logger.fatal( e.getMessage() );	
			throw e;
		}
		
	}
	
	private void displayQueue(Queue<Candy> dispenser) {
		logger.info("Called and executing displayQueue() method...");
		
		String temp = new String();
		ArrayList<Candy> queue = new ArrayList<>(dispenser);
		
		Iterator<Candy> iterate = queue.iterator();
		while(iterate.hasNext()) {
			
			//System.out.print (iterate.next().getFlavor());
			temp = temp + iterate.next().getFlavor();			
			
			if (iterate.hasNext()) {
				temp = temp + ", ";	
			}
		}			
		
		logger.info("Exit displayQueue() method...");
		logger.info("Result: " + temp );
	}
	
}
