package com.Prgs.Arrays;
/*Write a Java program to find maximum and minimum element in an array. */
public class Max_Min {

	public static void main(String[] args) {
		int arr[]={33,6,45,12,8};
		int MAX=arr[0], MIN=arr[0];
		for(int i=0;i<arr.length;i++)
		{
		    if(arr[i]<MIN)
		    {
		        MIN =arr[i];
		    }
		    if(arr[i]>MAX){
		        MAX=arr[i];
		    }
		 }
		 System.out.println("Minimum no is :"+ MIN+"\n"+"Maximum no in array is "+MAX);
	}
}

