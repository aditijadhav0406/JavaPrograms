package com.Prgs.LoopsPrgs;
import java.util.Scanner;
public class Factor_factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Write a Java program to find all factors of a number.
         23.	Write a Java program to calculate factorial of a number
       */
		Scanner s =new Scanner(System.in);
		int v;
        System.out.println("Enter a number to find out Factor:");
        v =s.nextInt();
         for(int k =1;k<=v;k++)
        {
        	if(v%k==0)
        	{
        		System.out.println(k +" ");
        	}
        }
        /*Factorial*/
        int y,fact =1;
        System.out.println("Enter the number to find factorial:");
        y =s.nextInt();
        while(0<y)
        {
        	fact=fact*y;
        	y--;
        }
        System.out.println("Factorial of is" +fact);
        s.close();
	}

}
