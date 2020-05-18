package com.sriwork;

public class PrintNumbersUsingDoWhile {
  
	public static void main(String[] args) {
		int i = 0;
		int temp = 11;
		do 
		{
			System.out.print(i);
			i++;
			if(i == temp) {
				temp = temp + 10;
				System.out.println();
			}
			
		}while(i <= 100);
	
}
}
