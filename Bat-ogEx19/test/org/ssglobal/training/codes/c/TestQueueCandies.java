package org.ssglobal.training.codes.c;

import java.util.ArrayDeque;
import java.util.Queue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestQueueCandies {
	// Flavors: Blue Raspberry, Chocolate, Cola, Grape, Green Apple, Lemon, Orange, Peppermint, Raspberry
	
	QueueCandies queueC ;
	
	@BeforeEach
	public void setup() {
		queueC = new QueueCandies();
	}	
	
	
	@Test
	public void testQCandies_Monday_DispenserNotEmpty () {
		
		Assertions.assertDoesNotThrow( () -> {
			queueC.getCandy( fillDispenser(), 0 );
		});
	}
	
	@Test
	public void testQCandies_Sunday_DispenserNotEmpty () {
		
		Assertions.assertDoesNotThrow( () -> {
			queueC.getCandy( fillDispenser(), 6 );
		});
	}
	
	@Test
	public void testQCandies_DispenserNotEmpty () {
		
		Assertions.assertThrows(NullPointerException.class, () -> {
			queueC.getCandy( null, 0 );
		});
	}
	
	@Test
	public void testQCandies_InvalidDay () {
		
		Assertions.assertDoesNotThrow( () -> {
			queueC.getCandy( fillDispenser(), 7 );
		});
	}

	@AfterEach
	public void teardown() {
		queueC = null;
	}
	
	// Test Data
	private static Queue<Candy> fillDispenser() {
		Queue<Candy> dispenser = new ArrayDeque<>();
		
		Candy bluerasp 	= new Candy("Blue Raspberry");
		Candy choco 	= new Candy("Chocolate");
		Candy cola 		= new Candy("Cola");
		Candy grape 	= new Candy("Grape");
		Candy greenapp 	= new Candy("Green Apple");
		Candy lemon 	= new Candy("Lemon");
		Candy orange 	= new Candy("Orange");
		Candy pmint 	= new Candy("Peppermint");
		Candy rasp 		= new Candy("Raspberry");
		
		try {
			dispenser.offer(bluerasp);
			dispenser.offer(choco);
			dispenser.offer(cola);
			dispenser.offer(grape);
			dispenser.offer(greenapp);
			dispenser.offer(lemon);
			dispenser.offer(orange);
			dispenser.offer(orange);
			dispenser.offer(choco);
			dispenser.offer(orange);
			dispenser.offer(pmint);
			dispenser.offer(rasp);				
		} catch (ClassCastException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} 
		
		return dispenser;		
	}
}
