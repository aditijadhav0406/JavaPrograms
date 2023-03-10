package com.Prgs.LoopsPrgs;
import java.util.Scanner;

public class Prime_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Write a Java program to check whether a number is Prime number or not.
          27.	Write a Java program to print all Prime numbers between 1 to n.
          28.	Write a Java program to find sum of all prime numbers between 1 to n.
        */
		Scanner s =new Scanner(System.in);
		int d,flag=0;
		System.out.println("Enter a number to check Prime Number:");
		d=s.nextInt();
        if(d<=1)
        {
          System.out.println("The number is not prime");
         
          }
        for(int b=1;b<=d/2;b++)
        {
        	if(d%b ==0)
        	{
        		flag++;
        	}
        }
        if(flag ==0)
        {
        	System.out.println("The number is not prime");
       }else {
    	   System.out.println("The number is prime");
       }
        /*Prime number &sum */
        int m, number, count1,end,sum1=0; 
		
		System.out.println(" Enter end number to find out Prime number in range : ");
		end =s.nextInt();
		System.out.println(" Prime numbers from 1 to" +end+"are:");
		for(number = 1; number <= end; number++)
		{
			count1 = 0;
		    for (m = 2; m <= number/2; m++)
		    {
		    	if(number % m == 0)
		    	{
		    		count1++;
		    		break;
		    	}
		    }
		    if(count1 == 0 && number != 1 ) {
		      System.out.println(number + " "); 
		      sum1 =sum1+number;
		    }
		}
		   System.out.println(" Sum of prime numbers is : "+sum1); 
	}

}
