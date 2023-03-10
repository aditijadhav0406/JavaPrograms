package com.Prgs.Conditionals;
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Write a Java program to check whether a number is even or odd using conditional operator.*/
		Scanner s = new Scanner(System.in);
		int x ;
		System.out.println("Enter a Number: ");
		 x =s.nextInt();
		 if(x %2 ==0)
	      {
	    	  System.out.println("Even number");
	      }
	      else {
	    	  System.out.println("ODD");
	      }
		
		s.close();
	}

}
