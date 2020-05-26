package com.sripractice.array.string;

public class StringBufferExample {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello ");
		sb.append("Java");
		System.out.println(sb);
		sb.insert(1, "java");
		System.out.println(sb);
		sb.replace(1,5, "java");
		System.out.println(sb);
		sb.delete(1, 5);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.capacity();
		sb.ensureCapacity(50);
		System.out.println(sb.capacity());
		
	}
}
