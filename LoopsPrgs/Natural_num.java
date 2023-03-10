package com.Prgs.LoopsPrgs;
import java.util.Scanner;
public class Natural_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1.Write a Java program to print all natural numbers from 1 to n. - using while loop
		Write a Java program to print all natural numbers in reverse (from n to 1). - using while loop*/
		Scanner s =new Scanner(System.in);
		 int n,i=1;
         System.out.println("Enter the end number :");
         n=s.nextInt();
         while(i<=n) {
      	   System.out.println(i);
 			   i++; 
         }
         System.out.println();
         
         /*Reverse loop*/
         int a,b=1;
         System.out.println("Enter the end number :");
         a=s.nextInt();
         while(a>=b)
         {
      	   System.out.println(a);
             a--;
         }

 			   s.close();
	}

}
