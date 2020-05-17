package com.killthecode;

import java.util.Scanner;

public class ArmStrongNumber {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number here to check : ");
		int number = 153;
		int result = number;
		int var1 = 0;
		int var2 = 0;
		
		while(number != 0) {
			
			var1 = number%10;
			var2 = var2+(var1*var1*var1);
			System.out.println("var2 in loop:" + var2);
			number = number/10;
		}
	
		
		if(number==var2) {  
	    System.out.println("armstrong number");   
		}
	    else  {
	        System.out.println("Not armstrong number"); 
	    }
	  }
}

