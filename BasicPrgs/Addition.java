package com.Prgs.BasicPrg;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Write a Java program to enter two numbers and find their sum.*/
		Scanner scan =new Scanner(System.in);
		int a ,b,sum;
	       System.out.println("Sum of Two numbers");
	       System.out.println(" Enter two numbers: ");
	       a = scan.nextInt();
	       b = scan.nextInt();
	       sum =a+b;
	       System.out.println("Sum of "+ a +" and "+ b +" is : " +sum);
	       scan.close();
	}

}
