package com.sripractice.array.string;

public class ReturnArrayMethod {
	
	public static int[] retuenArray() {
		return new int[] {22,7,55,77,33,56};
	}

	public static void main(String[] args) {
		int arr[] = retuenArray();
		for(int i = 0; i< arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
