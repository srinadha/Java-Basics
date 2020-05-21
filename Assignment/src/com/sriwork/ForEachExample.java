package com.sriwork;

public class ForEachExample {

	public static void main(String[] args) {
		int arr[] = {11,23,4,35,6,7,864,456,678};
		for(int i: arr) {
			System.out.print(i+ " ");
		}
		
		aa:
		for(int i = 1; i <= 3; i++) {
			bb:
				for(int j = 1; j <= 3; j++) {
					if(i == 2 && j == 2) {
						break aa;
					}
					System.out.println(i+" "+j);
				}
		}
	}
}
