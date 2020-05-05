package com.Sriwork;

import java.awt.Point;

public class TypeCasting {
	
	public static void main(String[] args) {
		 byte a = 1;
		 byte b = a;
		 a = 2;
		 
		 //System.out.println(b);
		 
		 Point point1 = new Point(1,1);
		 Point point2 =  point1;
		 
		 point1.x = 2;
		 
		 System.out.println(point1);
		 System.out.println(point2);
	}
}