package com.Prgs.Conditionals;
import java.util.Scanner;
public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Write a Java program to check whether year is leap year or not using conditional operator.*/
		Scanner s = new Scanner(System.in);
		 int year;
	      System.out.println("Enter the year");
	      year =s.nextInt();
	      if(year % 4 ==0  && year %400  ==0)
	         System.out.println("Leap year");
	      else
	    	 System.out.println("not a leap year");
	      s.close();
	}

}
