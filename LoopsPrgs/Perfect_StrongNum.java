package com.Prgs.LoopsPrgs;
import java.util.Scanner;
public class Perfect_StrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Write a Java program to print all Perfect numbers between 1 to n.
            34.	Write a Java program to check whether a number is Strong number or not.
          35.	Write a Java program to print all Strong numbers between 1 to n.
        */
		Scanner s =new Scanner(System.in);
		int i,j,sum,a;
	       System.out.println("Enter the end number to till which you want to find Perfect number:");
	       a=s.nextInt();
	       for(i=1;i<=a;i++)
	       { 
	    	   sum=0;
	    	   for(j=1;j<i;j++)
	    	   {
	    	   if(a%i ==0)
	    	   {
	    		   sum =sum+i;
	    	   }
	          }
	         if(sum==a)
	         {
	    	   System.out.println(a+ " ");
	          }
	       }
	       /*Strong number */
	       int num,b,c,fact,rem,sums=0;
	       System.out.println("Enter the number to check Strong number:");
	       num=s.nextInt();
	       b=num;
	       while(b>0)
	       {
	    	   c=1;
	    	   fact=1;
	    	   rem =b%10;
	    	   while(c<=rem)
	    	   {
	    		   fact =fact*c;
	    		   c++;
	    	   }
	    	   System.out.println("The factorial of"+rem+"="+fact);
	    	   sums =sums+fact;
	    	   b=b/10;
	    	   }
	    	   System.out.println("The sum of factorial of num"+num+ " is"+sums);
	    	   if(num==sums)
	    	   {
	    		   System.out.println(num+"is a strong number");
	    		   
	    	   }
	    	   else
	    		   System.out.println(num+"is not strong number"); 
	       
	       s.close();
	}

}
