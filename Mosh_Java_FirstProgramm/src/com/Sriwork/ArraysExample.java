package com.Sriwork;

public class ArraysExample {
	
	public static int[] numbers = {10,20,30,40,50};
	
	public static int[] num = new int[5];
	

	static void min(int arr[]) {
		int min = arr[0];
		for(int i = 0; i < num.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
			}
		System.out.println(min);
	}
	
	public static void main(String[] args) {
		
		min(numbers);
	
//		System.out.println(num.length);
//		
//		for (int i: numbers) {
//			System.out.println(i);
//		}
////		
//		for(int i = 0; i < num.length; i++) {
//			System.out.println("values of array ny index : " + num[i]);
//		}
		
		
	}
}
		
