package com.Sriwork;

public class ControlFlowExamples {
	
	public static void main(String[] args) {
		int temperature = 52;
		int income  = 20_000;
		boolean hasHighIncome = (income > 100_000);
		System.out.println(hasHighIncome);
		
 		if(temperature > 30) {
			System.out.println("Its hot day");
			System.out.println("Drink lots of water");
		}
		else if (temperature > 20) 
			System.out.println("Its a beautiful day");
		else
			System.out.println("It is a cold day");
	
	
}
}
