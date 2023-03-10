package com.Prgs.BasicPrg;
import java.util.Scanner;
public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Write a Java program to enter radius of a circle and find its diameter, circumference and area.*/
		Scanner scanobj = new Scanner(System.in);
		int r,pi=10;
	       System.out.println("Enter Radius:");
	       r =scanobj.nextInt();
	       System.out.println("Circumference of Circle: "+ 2*pi*r);
	       System.out.println("Diameter: " +2*r);
	       System.out.println("Area :" +pi*r*r);
	       scanobj.close();

	}

}
