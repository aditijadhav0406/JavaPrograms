package com.Prgs.Arrays;
import java.util.Arrays;
/*Write a Java program to put even and odd elements of array in two separate array.*/
public class EvenOddArray {
	public static void main(String[] args) {
	              
    int arr[] ={3,6,9,12,4};
    int arrEven[]=new int[arr.length];
    int arrOdd[]=new int[arr.length];
   int evencount=0;
   int oddcount=0;
    
     for(int i=0;i<arr.length;i++)
     {
         if(arr[i]%2==0)
         {
           arrEven[evencount++]=arr[i];  
         }else{
             arrOdd[oddcount++]=arr[i];
         }
         
     }
     arrEven = Arrays.copyOf(arrEven, evencount);
      arrOdd = Arrays.copyOf(arrOdd, oddcount);
      System.out.print("Even Elements in the array are:");
        for(int i = 0; i < arrEven.length; i++)
        {
            System.out.print(arrEven[i]+" ");
        }
       
       System.out.print("\n Odd Elements in the array are:");
        for(int i = 0; i < arrOdd.length; i++)
        {
            System.out.print(arrOdd[i]+" ");
        }
    }
}

