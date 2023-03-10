package com.Prgs.Functions;
/*13.	Write a Java program to find sum of all natural numbers between 1 to n using recursion*/
public class Sum_naturalNum {

		    public static void main(String[] args) {
		        int n = 50;
        int sum =Sum_Natural(n);
        System.out.println("Sum of natural numbers are:" + sum);
		}
			    
		    public static int Sum_Natural(int n) {
		        if (n == 1) {
		            return 1;
		        } else {
	            return n + Sum_Natural(n-1);
		        }
		    }
		
		}

