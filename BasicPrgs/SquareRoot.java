package com.Prgs.BasicPrg;
import java.util.Scanner;
public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Write a Java program to enter any number and calculate its square root.*/
		Scanner scanobj = new Scanner(System.in);
		double n,nsqrt;
        System.out.println("Squareroot of a number");
        System.out.println("Enter the number :");
        n =scanobj.nextDouble();
        nsqrt = (double)Math.sqrt(n);
        System.out.println("Square root of " + n + " is " + nsqrt );
		
		scanobj.close();
	}

}
