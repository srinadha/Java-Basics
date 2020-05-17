package com.killthecode;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
	       Scanner scanner = new Scanner(System.in);
	       System.out.println("enter yout number to find out how many primes: ");
	       int number = scanner.nextInt();
	       if(number==0 || number == 2) 
	    	   System.out.println("it is not a prime number" + number);
	       for(int i = 3; i <= number; i++) {
	    	   if(i%2 == 0) { 
	    		  System.out.println(i + " is even number"); 
	    	   }
	    	   System.out.println(i + " is Prime number");
	       }
	}
}
