package com.Prgs.Arrays;
/*Write a Java program to count total number of negative elements in an array.
 * Write a Java program to copy all elements from an array to another array.*/
public class Negative_Sum {
	public static void main(String[] args) {
	int[] arr = { -1,8,-12,66,-50};
    int [] arr2=new int[arr.length];
    int countnegative=0;
    for (int i = 0; i < arr.length; i++)
    {
        arr2[i]=arr[i];
        if (arr[i]<0)
        {
            countnegative++;
        } 
    }
    
    System.out.println("Negative Numbers in the array are:"+countnegative);
    System.out.println("Original array is:");
    for(int i=0;i<arr.length;i++)
    {
        System.out.print(arr[i]+" ");
    }
    System.out.println("\n New   Copied array is:");
    for(int i=0;i<arr.length;i++)
    {
        System.out.print(arr2[i]+" ");
    }  
    
	}
}


