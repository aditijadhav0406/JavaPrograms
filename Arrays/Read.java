package com.Prgs.Arrays;
import java.util.Scanner;
/*1.	Write a Java program to read and print elements of array. */
public class Read {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner s = new Scanner(System.in);
   
   System.out.print("Enter the size of the array: ");
		int size = s.nextInt();
		 int[] arr = new int[size];

   System.out.println("Enter the elements of the array:");
		for (int i = 0; i < size; i++) {
		    arr[i] = s.nextInt();
		   }

  System.out.println("The elements of the array are:");
		   printArray(arr, 0);
		   s.close();
		 }
public static void printArray(int[] arr, int index) {
		 if (index == arr.length) 
		 {
		        return;
		      }

	System.out.print(arr[index] + " ");

	 printArray(arr, index + 1);
		    }

	}

   
