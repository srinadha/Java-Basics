package com.sriwork;

public class FunctionToCompareTwoValues {
	
	public static int compareNumbers(int val1, int val2) {
		int value = 0;
		if (val1 > val2) {
			value = val1;
			System.out.println(val1);
		}
		else
		{
			value = val2;
			System.out.println(val2);
		}
		return value;
	}
	public static void main(String[] args) {
		compareNumbers(9,19);
	}

}
