package com.Sriwork;

import java.util.Scanner;

public class LoopStatements {
	public static void main(String[] args) {
		
		String[] fruits = {"Apple" , "mango" , "Orange"};
		for(String s : fruits) {
			System.out.println(s);
		}
 	Scanner scanner = new Scanner(System.in); 
	String input = "";
	
	
	while(true)
	{
	System.out.println("Enter Input:");
	input = scanner.next().toLowerCase();
	if(input.equals("quit"))
		break;
	if(input.equals("pass"))
		continue;
	
	System.out.println(input);
	}  
	
	scanner.close();
	
}
}
