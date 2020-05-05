package com.Sriwork;

public class Increments {

	public static void main(String[] args) {
		int x = 1;
		int y = x++;//pre increment
		
		System.out.println(y);
		
		int z = 2;
		int a = ++z;//post increment
		
		System.out.println(a);
		
		int b = 2;
		b += 3;
		
		System.out.println(b);
	}
}
