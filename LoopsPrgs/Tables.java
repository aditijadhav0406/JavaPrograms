package com.Prgs.LoopsPrgs;
import java.util.Scanner;
public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Write a Java program to print multiplication table of any number.*/
		Scanner s =new Scanner(System.in);
        int v;
        System.out.println("Enter number to print table: ");
        v =s.nextInt();
        for(int r =1;r<=10;r++)
        {
        	System.out.println(v +" * " + r+" = "+v*r );
        }
        s.close();
	}

}
