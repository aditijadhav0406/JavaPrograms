package com.Prgs.Arrays;
import java.util.*;
/*Write a Java program to delete an element from an array at specified position.*/
public class Delete {

	public static void main(String[] args) {
      Scanner s=new Scanner (System.in);             
		 int n;               
	    System.out.println("Enter no of Elements in array:");
	    n =s.nextInt();
	    int[] arr =new int[n+1];
	     System.out.println("Enter elements:");
	     for(int i=0;i<n;i++)
	     {
	         arr[i]=s.nextInt();
	     }
	      System.out.print("Elements in the array are:");
	        for(int i = 0; i < n; i++)
	        {
	            System.out.print(arr[i]);
	        }
	        System.out.print(arr[n]);
	    System.out.println("\n Enter the index to delete a num:");
	    int x =s.nextInt();
	    for(int i=x;i<n-1;i++)
	    {
	        arr[i]=arr[i+1];
	    }
	    n=n-1;
	    System.out.print("Elements in the array are:");
	        for(int i = 0; i < n; i++)
	        {
	            System.out.print(arr[i]+",");
	        }
	        s.close();
	}
}

