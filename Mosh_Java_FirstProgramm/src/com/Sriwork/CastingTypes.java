package com.Sriwork;

public class CastingTypes {
	
	public static void main(String[] args) {
		//implicit casting
		short shortNumber = 1;
		int intNumber = shortNumber+4;
		
		System.out.println(intNumber);
		
		//byte -> short > int > long
		
		double x = 1.1;
		int y = (int)x +2;
		System.out.println(y);
		
		String example = "123";
		int convert = Integer.parseInt(example);
		
		System.out.println(convert);
		
	}

}
