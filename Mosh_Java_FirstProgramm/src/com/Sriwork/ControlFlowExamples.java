package com.Sriwork;

public class ControlFlowExamples {
	
	public static void main(String[] args) {
		int temperature = 32;
		if(temperature > 30) {
			System.out.println("Its hot day");
		}
		else if (temperature > 20 && temperature <= 30) 
			System.out.println("Its a beautiful day");
		else
			System.out.println("It is a cold day");
	}

}
