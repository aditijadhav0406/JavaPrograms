package com.Prgs.Arrays;
/*Write a Java program to merge two array to third array.*/
public class MergeArray {
	public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] mergedArr = new int[arr1.length + arr2.length];

        int index = 0;
        for(int i = 0; i < arr1.length; i++) {
            mergedArr[index] = arr1[i];
            index++;
        }
        for(int i = 0; i < arr2.length; i++) {
            mergedArr[index] = arr2[i];
            index++;
        }

        System.out.println("Merged array:");
        for(int i = 0; i < mergedArr.length; i++) {
            System.out.print(mergedArr[i] + " ");
        }
    }
}

