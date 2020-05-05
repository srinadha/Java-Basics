package com.Sriwork;

public class StringExamples {
	
	public static void main(String[] args) {
		
		final String message = "Hello World" + "!!" ;
		
		System.out.println(message +"* *");
		
		System.out.println(message.endsWith("!!"));
		
		System.out.println(message.length());
		
		System.out.println(message.indexOf('e'));
		
		System.out.println(message.replace("l", "*"));
		
		System.out.println(message.toLowerCase());
		
		System.out.println(message);
	}

}
