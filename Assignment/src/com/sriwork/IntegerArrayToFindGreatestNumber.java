package com.sriwork;

public class IntegerArrayToFindGreatestNumber {
	// given an integer to add all the numbers
	public static int addArray(int[] num) {
		int temp = 0;
		for(int i = 0; i < num.length; i++) {
			temp = temp + num[i];
		}
		System.out.println(temp);
		return temp;
	}
	//given an integer to find the greatest number
	public static void main(String[] args) {
		int[] numbers = {19,6,17,5,50};
		
		int max = numbers[0];
		
		for(int i = 1; i < numbers.length; i++) {
			if (max < numbers[i]) {
				max = numbers[i];
			}
		
		}
		System.out.println(max);
		
		addArray(numbers);
		
		
	}

}
