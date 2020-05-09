package com.Sriwork;

public class CreatingMethods {

	public static void main(String[] args) {
		
		String greet = greetUser("sri");
		System.out.println(greet);
	}
	
	public static String greetUser(String name) {
		return "Hello " + name ;
	}
}
