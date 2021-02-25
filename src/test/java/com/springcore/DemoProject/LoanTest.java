package com.springcore.DemoProject;

import static org.junit.Assert.*;

import org.junit.Test;

public class LoanTest {

	Loan loan = new Loan();
	
	@Test
	public void test() {
		
		loan.setAmount(123);
		assertEquals(123, loan.getAmount());
	}
	
	@Test
	public void testrate() {
		
		loan.setRate(123d);
		assertEquals(123d, loan.getRate(), 0);
	}
	
	@Test
	public void monthstest() {
		
		loan.setMonths(123);
		assertEquals(123, loan.getMonths());
	}

}
