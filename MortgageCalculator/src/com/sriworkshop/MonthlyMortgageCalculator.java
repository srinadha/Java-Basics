package com.sriworkshop;

import java.text.NumberFormat;
import java.util.Scanner;

public class MonthlyMortgageCalculator {
	
	public static void main(String[] args) {
		
		final byte MONTHS_IN_YEAR = 12;
		final byte PERCENT = 100;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your Principal:");
		final int Principal = scanner.nextInt();
		//System.out.println(Principal);
		
		System.out.println("Enter your annual   Interest:");
		final Float annualInterestRate = scanner.nextFloat();
	    //System.out.println(annualInterestRate);
		
		final Float monthlyInterestRate = annualInterestRate / PERCENT / MONTHS_IN_YEAR;
		System.out.println("Your Monthly Interest Rate: " + monthlyInterestRate);
		
		System.out.println("Period (Years)");
		final byte Period_0f_Years = scanner.nextByte();
		
		int noOfPayments = (Period_0f_Years * MONTHS_IN_YEAR);
		
		double mortgagePerMonth = Principal * (monthlyInterestRate * (Math.pow(1 + monthlyInterestRate,noOfPayments)))
				                  /Math.pow(1 + monthlyInterestRate,noOfPayments)-1;
		
		String Mortgage = NumberFormat.getCurrencyInstance().format(mortgagePerMonth);
		
		System.out.println("Your Mortgage Monthly:" + Mortgage);
		
	    scanner.close();	
	}

}
