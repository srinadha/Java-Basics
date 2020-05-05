package com.Sriwork;

public class MathClass {

	public static void main(String[] args) {
		
		int result = (int)Math.ceil(1.1F);
		
		int result1 = (int)Math.round(1.1F);
		
		int result3 = (int)Math.floor(100.99F);
		
		int result2 = Math.max(result, result1);	
		
		double result4 = Math.random() ;
		
		System.out.println(result4);
		
		System.out.println(result1);
	}
}
