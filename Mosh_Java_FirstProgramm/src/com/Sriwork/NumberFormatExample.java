package com.Sriwork;

import java.text.NumberFormat;

public class NumberFormatExample {
	
	public static void main(String[] args) {
		
		//showing the number format with comma and $ sign
	    
		
		String result = NumberFormat.getCurrencyInstance().format(12344532.988);
	   
	    System.out.println(result);
	    
	  //converting fraction to percentage
	    NumberFormat percent =  NumberFormat.getPercentInstance();
	    String result1 = percent.format(0.30);
	    System.out.println(Integer.parseInt(result1));
	    
		
	}

}
