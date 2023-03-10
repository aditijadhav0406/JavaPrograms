package com.Prgs.LoopsPrgs;

import java.util.Scanner;

public class First_LastNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Write a Java program to count number of digits in a number.
11.	Write a Java program to find first and last digit of a number.
12.	Write a Java program to find sum of first and last digit of a number.
*/
		 /*Count number in a Digits :*/
		Scanner s =new Scanner(System.in);
        int  number =134675 ,count =0;
        while(number != 0)
        {
        	number =number/10;
        	count ++;
        }
        System.out.println("Number of digits are :"+count);
        /*print first and last digit*/
        int j =1768934;
        int first =0,last =0;
        last = j%10;
        System.out.println("Last Digit:"+last);
        while(j!=0)
        {
        	first =j%10;
        	j/=10;
        }
        System.out.println("First Digit :"+first);
        System.out.println("Sum of First and Last Digit:" + (first+last));
       s.close();
       
	}

}
