package com.Prgs.Functions;
/*Write a Java program to check whether a number is even or odd using functions.*/
import java.util.Scanner;

public class EvenOdd {

    static void Evenodd(int x)
    {
       if(x%2==0)
       {
           System.out.println(x+" is Even number"); 
       }else
          System.out.println(x+" is ODD number"); 
       
    } 
  
	public static void main(String[] args) {
	    int x;
	    Scanner sc =  new Scanner(System.in);
	    x =sc.nextInt();
	    Evenodd(x);
	    sc.close();
	}
}
