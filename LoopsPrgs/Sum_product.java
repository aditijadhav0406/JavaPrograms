package com.Prgs.LoopsPrgs;
import java.util.Scanner;
public class Sum_product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*14.Write a Java program to calculate sum of digits of a number.
		15.	Write a Java program to calculate product of digits of a number.*/
		Scanner s =new Scanner(System.in);
		int n =124,sum=0,temp,product=1;
		while(n > 0)  
		{    
		temp = n % 10;  
		sum = sum + temp; 
		product =product *temp;
		n = n / 10;  
		}    
		System.out.println("Sum of Digits is: "+sum);
		System.out.println("Products of Digits is: "+product);  
       s.close();

	}

}
