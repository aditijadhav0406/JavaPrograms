package com.Prgs.LoopsPrgs;
import java.util.Scanner;
public class Sum_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*6.	Write a Java program to find sum of all natural numbers between 1 to n.
          7.	Write a Java program to find sum of all even numbers between 1 to n.
          8.	Write a Java program to find sum of all odd numbers between 1 to n.
        */
		Scanner s =new Scanner(System.in);
		/*sum till n*/
		System.out.println("Sum of Natural Number");
        int c,sum=0;
        System.out.println("Enter the end number :");
        c = s.nextInt();
        for(int t =0;t<=c;t++)
        {
        	sum =sum +t;
        }
        System.out.println("Sum of Natural Number is:"+sum);
       /*Sum of even */
        System.out.println("Sum of Even Number");
        int d,sum_even =0;
        System.out.println("Enter the end number :");
        d = s.nextInt();
       	
        for(int w =1;w<=d;w++)
        {
        	if(w%2==0)
        	{
        	sum_even =sum_even +w;
        	}
        }
        
        System.out.println("Sum of Even Numbers:"+sum_even);
        /*Sum of odd*/
        System.out.println("Sum of Odd Number");
        int f,sum_odd =0;
        System.out.println("Enter the end number :");
        f = s.nextInt();
       	
        for(int u =1;u<=f;u++)
        {
        	if(u%2!=0)
        	{
        	sum_odd =sum_odd +u;
        	}
        }
        System.out.println("Sum of Odd Number:"+sum_odd);
      s.close();
	}

}
