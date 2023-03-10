package com.Prgs.Arrays;
/*Write a Java program to print all unique elements in the array.*/
public class UniqueElements {
	public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2, 4, 5, 4, 4, 4};
        boolean isUnique;
 System.out.println("Unique elements in the array are:");
    for (int i = 0; i < arr.length; i++) {
            isUnique = true;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.println(arr[i]);
            }
        }
    }
}


