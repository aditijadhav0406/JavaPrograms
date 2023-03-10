package com.Prgs.LoopsPrgs;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Write a Java program to check whether a number is palindrome or not.*/
		Scanner s =new Scanner(System.in);
		System.out.print("Enter a number to check Palindrome: ");
	     int num =s.nextInt();
	     int sumr = 0, rem;
		 int tempr = num;    
	     while(num>0)
		   {    
	        rem = num % 10;   
	        sumr = (sumr*10)+rem;    
	        num = num/10;    
	       }    
	      if(tempr==sumr)    
	        System.out.println("It is a Palindrome number.");    
	      else    
	        System.out.println("Not a palindrome"); 
	      s.close();
	}

}
