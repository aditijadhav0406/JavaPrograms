package com.Prgs.Arrays;
/*Write a Java program to count total number of even and odd elements in an array.*/
public class CountNum {

	public static void main(String[] args) {
        int[] arr = { 15, 20, 25 ,33,77};
        int counteven=0,countodd=0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] %2==0)
            {
                counteven++;
            } else 
            {
                countodd++;
            }
        }
       System.out.println("NO of Even no in the array is:"+counteven);
       System.out.println("NO of Odd no in the array is:"+countodd);
        
	}
}

