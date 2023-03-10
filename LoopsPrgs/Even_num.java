package com.Prgs.LoopsPrgs;
import java.util.Scanner;
public class Even_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*4.Write a Java program to print all even numbers between 1 to 100. - using while loop
		 5.Write a Java program to print all odd number between 1 to 100 */
		 
		Scanner s =new Scanner(System.in);
		 int m=2;
         System.out.println("Even numbers:");
         while(m <=100)
         {
      	   
      	   if((m % 2 ) == 0)
      	      
      	       System.out.println(m);
      	   
      	   m++;
      	}
         /*Odd number*/
         int z=2;
         System.out.println("ODD numbers:");
         while(z <=100)
         {
      	   
      	   if((z % 2 ) != 0)
      	      
      	       System.out.println(z);
      	   
      	   z++;
      	}
         s.close();
	}

}
