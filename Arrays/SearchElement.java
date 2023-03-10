package com.Prgs.Arrays;
/*Write a Java program to search an element in an array.*/
public class SearchElement {
    public static void main(String[] args) {
        int[] arr = {45,77,12,1,5,30};
        boolean search = false;
        int key=5;
    
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element is at index:" + i);
                 search = true;
                break;
            }
        }
        
        if (!search) {
            System.out.println("Element not found");
        }
    }
}

