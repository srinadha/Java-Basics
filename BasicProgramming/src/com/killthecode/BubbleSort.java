package com.killthecode;

public class BubbleSort {
	
	public static void main(String[] args) {
		int []numbers = {22,2,1,33,25,4};
		
		for(int i = 0; i < numbers.length; i++ ) {
			for(int j = i; j < i+1 ; j++) {
				System.out.print(numbers[j]+ " " + numbers[i]);
			}
			System.out.println();
		}
	}

}
