package com.Prgs.Arrays;
/*Write a Java program to find second largest element in an array*/
public class SecondLargest {

    public static void main(String[] args) {
        int[] arr = { 5, 10, 55, 20, 25 };
        int secondLargest = Secondlargest(arr);
        System.out.println("The second largest element in the array is: " + secondLargest);
    }

    public static int Secondlargest(int[] arr) {
        int largest = arr[0],secondLargest = arr[0];
       
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}

