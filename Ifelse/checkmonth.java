package com.Prgs.Ifelse;
import java.util.Scanner;
public class checkmonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       /*
      11.Write a Java program to input week number and print week day.
      12.	Write a Java program to input month number and print number of days in that month.
      */
		Scanner s = new Scanner(System.in);
		
		/*to input week number and print week day*/
	      int num;
	      System.out.println("Program to check week");
	      System.out.println("Enter a week number(1-7):");
	      num =s.nextInt();
	      if(num ==1)
	    	  System.out.println("its Monday");
	      else if(num == 2)
	    	  System.out.println("its Tuesday");
	      else if(num == 3)
	    	  System.out.println("its Wednesday");
	      else if(num == 4)
	    	  System.out.println("its Thursday");
	      else if(num == 5)
	    	  System.out.println("its Friday");
	      else if(num == 6)
	    	  System.out.println("its Saturday");
	      else if(num == 7)
	    	  System.out.println("its Sunday");
	      
	      /*check month days*/
	      int noMonth;
	      System.out.println("Enter no of Month (1-12):");
	      noMonth =s.nextInt();	      
	      if(noMonth ==1)
	    	  System.out.println("January has 31 days");
	      else if(noMonth == 2)
	    	  System.out.println("February has 30 days");
	      else if(noMonth == 3)
	    	  System.out.println("March has 31 days");
	      else if(noMonth == 4)
	    	  System.out.println("April has 30 days");
	      else if(noMonth== 5)
	    	  System.out.println("May has 31 days");
	      else if(noMonth == 6)
	    	  System.out.println("June has 30 days");
	      else if(noMonth == 7)
	    	  System.out.println("July has 31 days");
	      else if(noMonth == 8)
	    	  System.out.println("August has 31 days");
	      else if(noMonth == 9)
	    	  System.out.println("September has 30 days");
	      else if(noMonth == 10)
	    	  System.out.println("October has 31 days");
	      else if(noMonth == 11)
	    	  System.out.println("November has 30 days");
	      else if(noMonth == 12)
	    	  System.out.println(" December has 31 days");
		s.close();
		
		
		
	}

}
