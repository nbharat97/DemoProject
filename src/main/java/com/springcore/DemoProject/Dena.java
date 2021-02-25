package com.springcore.DemoProject;

public class Dena extends Bank {

	
	public float interestrate(int amount) {
		
		float r = (float) (amount * 4.9)/100 + amount;
		return r;
	}
}
