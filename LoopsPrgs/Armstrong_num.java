package com.Prgs.LoopsPrgs;
import java.util.Scanner;
public class Armstrong_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Write a Java program to check whether a number is Armstrong number or not.*/
		Scanner scan = new Scanner(System.in);
		int p,sum_armstrong=0,l,k,u;
		  System.out.println("Enter the end numberto find out Armstrong number:");
		  k =scan.nextInt();
		  for(l=1;l<=k;l++)
		  {
			  p=l;
			  while(p>0)
			  {
				 u=p%10;
				 sum_armstrong =sum_armstrong + (u*u*u);
				 p=p/10;
			  }
			  if(sum_armstrong == l)
				  System.out.println(l+" ");
			  sum_armstrong =0;
			  scan.close();
		  }
		
	}
	 

}
