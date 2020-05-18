package com.sriwork;

public class SumOfNumbers {
	public static void main(String[] args) {
		System.out.println("printing numbers 1 to 100");
		int number = 100;
		int count = 11;
		for(int i = 1; i <= number; i++) {
			if(count == i) {
				count = count + (11-1);
				System.out.println();
			}
			System.out.print(i+" ");
		}
	}

}
