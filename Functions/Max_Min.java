package com.Prgs.Functions;
import java.util.*;
/*Java program to find maximum and minimum between two numbers using functions.*/
public class Max_Min {
		    static int max(int x,int y)
		    {
		       return(x>y)?x:y;
		    }
		    static int min(int x,int y)
		    {
		        return(x>y)?y:x;
		    }
		    
			public static void main(String[] args) {
			    int x,y;
			    Scanner sc =  new Scanner(System.in);
			    System.out.println("Enter two numbers to check max &min Number:");
			    x =sc.nextInt();
			    y =sc.nextInt();
			
			  System.out.println("Maximum number is:"+max(x,y));
		      System.out.println("Minimum number is:"+min(x,y));
     sc.close();
	}

}
