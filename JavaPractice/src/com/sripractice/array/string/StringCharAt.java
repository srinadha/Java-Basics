package com.sripractice.array.string;

public class StringCharAt {

	public static void main(String[] args) {
		String name = "javatpoint";
		System.out.println(name.charAt(0));
		for(int i = 0; i < name.length()-1; i++) {
			if(i%2 == 0) {
				System.out.println("chat at "+ i +" place " + name.charAt(i));
			}
		}
		String name1 = "javatpoint";
		System.out.println(name.compareTo(name1));
	}
}
