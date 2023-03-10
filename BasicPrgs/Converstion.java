package com.Prgs.BasicPrg;
import java.util.Scanner;
public class Converstion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Write a Java program to enter length in centimeter and convert it into meter and kilometer.*/
		Scanner scanobj = new Scanner(System.in);
		double cm,m,km;
        System.out.println("Enter length in Centimeter:");
        cm =scanobj.nextDouble();
        m = cm/100.0;
        km =cm/100000.0;
        System.out.println( cm + " in meter is : " +m);
        System.out.println( cm + "in kilometer is :  " + km );
		
		scanobj.close();
	}

}
