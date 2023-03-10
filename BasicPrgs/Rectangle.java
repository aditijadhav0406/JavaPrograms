package com.Prgs.BasicPrg;
import java.util.Scanner;
public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 4.Write a Java program to enter length and breadth of a rectangle and find its perimeter.
		5.	Write a Java program to enter length and breadth of a rectangle and find its area*/

		Scanner s =new Scanner(System.in);
		int h,w,perimeter,area;
	       System.out.println("Enter length & breadth :");
	       h = s.nextInt();
	       w=s.nextInt();
	       perimeter=2*(h+w);
	       area =h*w;
	       System.out.println("Area of rectangle: "+area);
	       System.out.println("Perimeter of rectangle: " +perimeter);
	       s.close();
	}

}
