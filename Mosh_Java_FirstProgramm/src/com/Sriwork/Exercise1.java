package com.Sriwork;

import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {
		 
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number");
		final int number = scanner.nextInt();
		
		if( number % 5 == 0 && number % 3 == 0) 
			System.out.println("Fizzbuzz");
		else if( number % 5 == 0) 
			System.out.println("buzz");
		else if(number % 3 == 0) 
			System.out.println("Fizz");
		else
			System.out.println(number);
	
		
	}

}
