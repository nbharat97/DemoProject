package com.springcore.DemoProject;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Assert;
import org.junit.Test;

public class ICICITest {

	ICICI icici = new ICICI();
	
	@Test
	public void interestrateTest() {
		
		assertNotNull(icici.interestrate(500000));
	}
	
	@Test
	public void offerTest() {
		
		icici.offer(); //method is void so no assertions
	}
	
}
