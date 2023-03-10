package com.Prgs.Ifelse;
import java.util.Scanner;
public class checktriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     /*
     14. Write a Java program to input angles of a triangle and check whether triangle is valid or not.
     15.Write a Java program to input all sides of a triangle and check whether triangle is valid or not.
     16. Write a Java program to check whether the triangle is equilateral, isosceles or scalene triangle.
    */
		Scanner s = new Scanner(System.in);
		
		/*Check triangle is valid or not*/
	      int a1,a2,a3;
	      System.out.println("Prgram to check if triangle is valid or not");
	      System.out.println("Enter 3 angles of triangle:");
	      a1 =s.nextInt();
	      a2 =s.nextInt();
	      a3 =s.nextInt();
	      if((a1+a2+a3 == 180))
	    	  System.out.println(" Trianlge is valid as sum of angle is 180");
	      else
	    	  System.out.println(" Triangle is not valid ");
	      
	      /*Sides */
	      int s1,s2,s3;
	      System.out.println("Program to check if sum of 2 side is third side ");
	      System.out.println("Enter 3 Sides of triangle:");
	      s1 =s.nextInt();
	      s2 =s.nextInt();
	      s3 =s.nextInt();
	      if((s1+s2 == s3))
	    	  System.out.println(" Trianlge is valid");
	      else
	    	  System.out.println(" Triangle is not valid ");
	
	      
	      /* types of triangle */
	      int t1,t2,t3;
	      System.out.println("Check type of triangle");
	      System.out.println("Enter 3 Sides of triangle:");
	      t1 =s.nextInt();
	      t2 =s.nextInt();
	      t3 =s.nextInt();
	      if((t1 == t2 &&  t2 == t3))
	    	  System.out.println(" Triangle is Equilateral Triangle");
	      else if(t1 == t2 || t2 == t3 || t1 == t3 )
	    	  System.out.println(" Triangle is isosceles triangle ");
	      else
	    	  System.out.println(" Triangle is Scalene Triangle ");
	      
	      s.close();
		
		
	}

}
