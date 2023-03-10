package com.Prgs.LoopsPrgs;
import java.util.Scanner;
public class Decimal_to_Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Write a Java program to convert Decimal to Binary number system.*/
		Scanner s = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = s.nextInt();
        String binaryStr = Integer.toBinaryString(decimal);
        System.out.println("Binary equivalent of " + decimal + " is " + binaryStr);
        s.close();
	}

}
