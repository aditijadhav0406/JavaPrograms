package com.Prgs.LoopsPrgs;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Write a Java program to print Fibonacci series up to n terms.*/
		Scanner s =new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = s.nextInt();
        int first = 0, second = 1;
        System.out.print("Fibonacci series up to " + n + " terms: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
       s.close();
        } 
	}

}
