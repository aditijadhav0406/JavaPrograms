package com.Prgs.SwitchPrgs;
import java.util.Scanner;
public class Days {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1.	Write a Java program to print day of week name using switch case.*/
		Scanner s = new Scanner(System.in);
		int day;
        System.out.println("Enter week number(1-7) :");
       day =s.nextInt();
       switch(day)
       {
       case 1 :
    	   System.out.println("Monday");
    	   break;
       case 2 :
    	   System.out.println("Tuesday");
    	   break;
       case 3:
    	   System.out.println("Wednesday");
    	   break;
       case 4:
    	   System.out.println("Thursday");
    	   break;
       case 5:
    	   System.out.println("Friday");
    	   break;
       case 6:
    	   System.out.println("Saturday");
    	   break;
       case 7:
    	   System.out.println("Sunday");
    	   break;
    	default:
    		System.out.println("Invalid day number");
            break;
            
         }
       s.close();
	}

}
