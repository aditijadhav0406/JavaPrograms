package com.Prgs.Conditionals;

import java.util.Scanner;

public class Max_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Write a Java program to find maximum between two numbers using conditional operator.
		2.	Write a Java program to find maximum between three numbers using conditional operator.*/
		Scanner s = new Scanner(System.in);
	       int a,b;
	       System.out.println("Enter two nos:");
	       a=s.nextInt();
	       b=s.nextInt();
	       if(a>b)
	    	   System.out.println("Greater number is" + a);
	       else
	    	   System.out.println("Greater number is " + b);
		
	 /*Three no */
	       int x,y,z;
		 System.out.println("Enter three nos:");
	     x=s.nextInt();
	     y=s.nextInt();
	     z=s.nextInt();
	     if(x>y && x>z)
	  	   System.out.println("Greater number is" + x);
	     else if(y>x && y>z)
	  	   System.out.println("Greater number is " + y);
	     else
	    	 System.out.println("Greater number is " + z);
	     s.close();
	}

}
