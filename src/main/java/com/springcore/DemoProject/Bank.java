package com.springcore.DemoProject;

import java.util.Scanner;

public class Bank {

	public static void main(String args[]){  
		
		Loan l = new Loan();
		
		System.out.println("Enter the amount: ");
		ICICI i = new ICICI();
		Dena d = new Dena();
		SBI s = new SBI();
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		l.amount = a;
		
		i.offer();
		
		System.out.println("Amount for Dena is " + d.interestrate(l.amount));
		System.out.println("Amount for SBI is " + s.interestrate(a));
		System.out.println("Amount for ICICI is " + i.interestrate(a));
		
	}
}
