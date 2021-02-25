package com.springcore.DemoProject;

import java.util.Scanner;

public class ICICI extends Bank {
	
	Scanner sc = new Scanner(System.in);
	
	public float interestrate(int amount) {
		
		float r = (float) (amount * 5.1)/100 + amount;
		return r;
		
	}
	
	public void offer() {
		
		System.out.println("Also get Car Loan Approved after opening an account during this festive period #ICICI");
		
		
	}
	
}
