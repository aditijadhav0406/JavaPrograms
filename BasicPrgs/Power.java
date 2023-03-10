package com.Prgs.BasicPrg;
import java.util.Scanner;
public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Write a Java program to find power of any number x ^ y.*/
		Scanner scanobj = new Scanner(System.in);
		System.out.println("Enter the base & exponent values");
        int base = scanobj.nextInt();
        int exponent = scanobj.nextInt();
        int power = 1;
        power = (int)Math.pow(base, exponent);
        System.out.println("Power of"+ base+" is : "  + power);
		scanobj.close();
	}

}
