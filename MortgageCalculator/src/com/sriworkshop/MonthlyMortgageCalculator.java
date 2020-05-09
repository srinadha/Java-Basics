package com.sriworkshop;

import java.text.NumberFormat;
import java.util.Scanner;

public class MonthlyMortgageCalculator {
	
	final static byte MONTHS_IN_YEAR = 12;
	final static byte PERCENT = 100;
	
	public static void main(String[] args) {
		
		
		 int principal = (int)(readNumber("Principal:", 1000, 1_000_000));
		 float annualInterest = (float)(readNumber("Annual Interest:", 0,30));
		 byte years = (byte) (readNumber("years:", 0, 30));
		  
		 double mortgage = CalculateMortgage(
					principal,
					annualInterest,
					years);
		String monthlyPayments = NumberFormat.getCurrencyInstance().format(mortgage);
		System.out.println("Your Mortgage Monthly:" + monthlyPayments);
		
		for( short month = 1; month <= years * MONTHS_IN_YEAR; month++) {
			double balance = calculateBalance(principal, annualInterest, years, month);
			String totalBalance = NumberFormat.getCurrencyInstance().format(balance);
			System.out.println(totalBalance);
		}
		
    }
			
	public static double readNumber(String prompt, double min, double max) {
		Scanner scanner = new Scanner(System.in);
		double value;
		while (true) {
			System.out.println(prompt);
			value = scanner.nextFloat();
			if (value >= min && value <= max) 
				break;
			System.out.println("Enter a value between" + min + "and" + "max" );
		    }
		return value;   
	}
	
	public static double CalculateMortgage(
			int principal,
			float annualInterest,
			short years) {
		

		short noOfPayments = (short)(years * MONTHS_IN_YEAR);
		Float monthlyInterestRate = annualInterest / PERCENT / MONTHS_IN_YEAR;
		
		double mortgagePerMonth = principal * (monthlyInterestRate * 
				(Math.pow(1 + monthlyInterestRate,noOfPayments)))
                /Math.pow(1 + monthlyInterestRate,noOfPayments)-1;
		
		return mortgagePerMonth;
	}
	
	public static double calculateBalance(
			int principal,
			float annualInterest,
			byte years,
			short noOfPaymentsMade) {
		 
		short noOfPayments = (short)(years * MONTHS_IN_YEAR);
		float monthlyInterestRate = annualInterest / PERCENT / MONTHS_IN_YEAR;
		
		double Balance = principal * 
				((Math.pow(1 + monthlyInterestRate,noOfPayments))
				- (Math.pow(1 + monthlyInterestRate,noOfPaymentsMade)))
				/((Math.pow(1 + monthlyInterestRate,noOfPayments)-1));
		return Balance;
		
	}
}
		

  
