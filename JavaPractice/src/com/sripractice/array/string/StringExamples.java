package com.sripractice.array.string;

public class StringExamples {

	public static void main(String[] args) {
		String name = "javatpoint";
		char ch = name.charAt(2);
		for(int i = 0; i < name.length()-1; i++) {
			if(i%2 == 0) {
				System.out.println(name.charAt(i));
			}
		}
		String s1 = "This is new java t point";
		int index = s1.indexOf("is");
		System.out.println(s1.substring(1,10));
		String str2 = String.join("-","This","is","new");
		String[] s3 = s1.split("//s");
		for(int i = 0; i < s3.length; i++) {
			System.out.println(s3[i]);
		}
	}
}
