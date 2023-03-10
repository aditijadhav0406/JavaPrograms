package com.Prgs.SwitchPrgs;
import java.util.Scanner;
public class check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*4. Write a Java program to find maximum between two numbers using switch case.
          5.	Write a Java program to check whether a number is even or odd using switch case.
      */
		Scanner s = new Scanner(System.in);
		/*Write a Java program to check whether a number is even or odd using switch case.*/
        
        /*even or odd*/
        int num ;
        System.out.println("Enter number to check even or odd");
        num =s.nextInt();
        switch(num % 2)
        {
        case 0: 
        	System.out.println(num + "is a Even number");
        	break ;
        case 1:
        	System.out.println(num + "is a Odd number");
        	break ;
        }
        
        s.close();
	}

}
