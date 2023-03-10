package com.Prgs.Arrays;
import java.util.Scanner;
/*Write a Java program to find sum of all array elements. */
public class Sum {

	  public static void main (String[]args)
	  {
	    int sum = 0, n=0;
	    Scanner scan = new Scanner (System.in);
	    int[] data = { 5, 6, 1, 2, 3 };
	    System.out.println ("Sum of  numbers  in array are:");
	    while (n < data.length)
	      {
		sum = sum + data[n];
		n++;
	      }
	      
	 System.out.println(sum);    
     scan.close();
	  }
	}

