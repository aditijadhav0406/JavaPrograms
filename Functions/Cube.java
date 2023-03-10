package com.Prgs.Functions;
import java.util.*;
public class Cube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1.	Write a Java program to find cube of any number using function*/
		Scanner s = new Scanner(System.in);
			int n,cube;
			System.out.println("Enter a number to find cube:");
			n =s.nextInt();
		    cube = funCube(n);
        	System.out.print("The cube of number is:"+cube);
        	s.close();
		}
		public static int funCube(int n)
		{
		return n*n*n;
}
}


