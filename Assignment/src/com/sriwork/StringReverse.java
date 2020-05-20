package com.sriwork;

public class StringReverse {
	
	public static String str = "Welcome to Javatpoint portal";

	public static void main(String[] args) {
		String s1 = "java";
		String reverse = "";
		for(int i = s1.length()-1; i >= 0; i--) 
		{
			reverse = reverse + s1.charAt(i);
		}
		System.out.println(reverse);
		countFrequency("welcome to javatpoint");
	}
	
	// counting frequency of a character in the string
	
	public static int countFrequency(String Str) {
		int count = 0;
		for(int i = 0; i < str.length(); i++)
		{
			if(str.charAt(i) == 't')
			{
				count++;
			}
		}
		System.out.println("Frequency of 't' is : "+ count);
		return count;
	}
	
	
}
