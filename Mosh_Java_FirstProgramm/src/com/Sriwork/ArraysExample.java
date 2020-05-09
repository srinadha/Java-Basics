package com.Sriwork;

import java.util.Arrays;

public class ArraysExample {

	public static void main(String[] args) {
		int[] numbers =  new int[5]; //older version of initalizing the arrays
		
		numbers[0] = 1;
		numbers[1] = 2;
		
		int[] numbersNew = {3,2,4,1,5};  //new Array representation
		
		for (int i = 0; i <= numbersNew.length; i++) {
			System.out.println(numbersNew[i]);
		}
		
		//numbersNew[10] = 3;
		
		Arrays.sort(numbersNew);
				
		System.out.println(Arrays.toString(numbersNew));
		
		
		
		 String[] messages = new String[10];
		 
		 messages[0] = "Srinath";
		 messages[1] = "mahesh";
		 messages[2] = "priyanka";
		 messages[3] = "vikram";
		 
		 System.out.println(Arrays.deepToString(messages));
		 System.out.println(messages.length );
		 
		 Boolean[] condition = new Boolean[2];
		 
		 System.out.println(Arrays.deepToString(condition));
		 
		 int[] numbersArray = new int[10];
		 
		 numbersArray[0] = 10;
		 numbersArray[1] = 12;
		 numbersArray[3] = 3;
		 
		 Arrays.sort(numbersArray);
		 System.out.println(Arrays.toString(numbersArray));
		 
		
		  

	}
}
