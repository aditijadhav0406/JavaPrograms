package com.Prgs.BasicPrg;

import java.util.Scanner;

public class Arithmaticop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Write a Java program to enter two numbers and perform all arithmetic operations.*/
		int a,b,sum,sub,mul,div,modulas;
		Scanner scan =new Scanner(System.in);
		System.out.println(" Enter two numbers: ");
	       a = scan.nextInt();
	       b = scan.nextInt();
		   sum =a+b;
	       sub =a-b;
	       mul =a*b;
	       div= a/b;
	       modulas=a%b;
	       System.out.println("Arithmatic Operations:");
	       System.out.println("Addition of "+ a +" and "+ b +" is : " +sum);
	       System.out.println("Subtraction of" + a + " and " + b +sub);
	       System.out.println("Multiplication of "+ a +" and "+ b +" is : " +mul);
	       System.out.println("Division of "+ a +" and "+ b +" is : " +div);
	       System.out.println("Modulas of "+ a +" and "+ b +" is : " +modulas);
	       System.out.println("Increment of "+ a + "is" + ++a);
	       System.out.println("Decrement of "+ a + "is" + --a);
	       scan.close();
	}

}
