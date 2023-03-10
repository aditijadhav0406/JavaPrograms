package com.Prgs.Arrays;
import java.util.Scanner;
/*Write a Java program to print all negative elements in an array.*/
public class NegativeNum {
	public static void main(String[] args) {
	 int n=0;
	 Scanner s =  new Scanner(System.in);
	int[] data ={45,67,-12,-1,33};
	 System.out.println("Negative numbers are:");
	while(n<data.length)
	{
	    if(data[n]<0)
	    {
	        System.out.println(data[n]);
	    }
	    n++;
	    
	}
	s.close();
  }
}


