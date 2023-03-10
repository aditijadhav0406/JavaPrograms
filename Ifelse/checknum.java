package com.Prgs.Ifelse;
import java.util.Scanner;

public class checknum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Write a Java program to check whether a number is negative, positive or zero.
         4.	Write a Java program to check whether a number is divisible by 5 and 11 or not.*/
		Scanner s = new Scanner(System.in);
		int no;
		System.out.println("Enter the number to check positive or negative number:");
		no =s.nextInt();
		if(no <0)
			System.out.println(no + " Is a negative number");
		else if(no>0)
			System.out.println(no + " Is a postive number");
		else
			System.out.println("no is equal to zero");
		
		/*divisible by 5 & 11*/
		System.out.println("Program to check if no is divisible to 5 & 11");
		if(no %5 ==0  && no% 11 ==0)
			System.out.println( no +" is divisible by 5 & 11");
		else
			System.out.println(no +" is not divisible by 5 & 11");
		

		s.close();
	}

}
