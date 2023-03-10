package com.Prgs.LoopsPrgs;
import java.util.Scanner;
public class Octal_to_decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Write a Java program to convert Octal to Decimal number system.*/
		int decimal = 0,power=0;
		Scanner s = new Scanner(System.in);
        System.out.print("Enter an octal number: ");
        String octalStr = s.nextLine(); 
        for (int i = octalStr.length() - 1; i >= 0; i--) {
            int digit = Integer.parseInt(String.valueOf(octalStr.charAt(i)));
            decimal += digit * Math.pow(8, power);
            power++;
        }

        System.out.println("Decimal of " + octalStr + " is " + decimal);
 s.close();
	}

}
