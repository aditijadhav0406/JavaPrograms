package com.Prgs.Functions;

public class Evenodd_Range {
	
	public static void main(String[] args) {
        int start = 1;
        int end = 50;
        System.out.println("Even numbers are:");
         Even(start, end);
        System.out.println("\n Odd numbers are:");
        Odd(start, end);
    }
    
    public static void Even(int start, int end) {
        if (start > end) {
            return;
        }
        if (start % 2 == 0) {
            System.out.print(start + " ");
        }
        Even(start + 1, end);
    }
    
    public static void Odd(int start, int end) {
        if (start > end) {
            return;
        }
        if (start % 2 == 1) {
            System.out.print(start + " ");
        }
        Odd(start + 1, end);
    }

}

