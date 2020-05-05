package com.Sriwork;

import java.util.Scanner;

public class UserInputValue {
	public static void main(String[] args) {
		
		//to read the byte number from system
		Scanner scanner =  new Scanner(System.in);
		System.out.print("Enter age:");
		byte age = scanner.nextByte();
		System.out.println("you are " + age);
		
		System.out.print("Enter name:");
		String name = scanner.next().strip();
		System.out.println("you are " + name);
		
		//to read the string from system
	}

}
