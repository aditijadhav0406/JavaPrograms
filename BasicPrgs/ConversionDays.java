package com.Prgs.BasicPrg;
import java.util.Scanner;
public class ConversionDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Write a Java program to convert days into years, weeks and days.*/
		Scanner scanobj = new Scanner(System.in);
		int day,year,week,days;
        System.out.println("Enter No of days :");
        day =scanobj.nextInt();
        year =day/365;
        day =day % 365;
        week =day /7;
        day =day% 7;
        days =day;
        System.out.println("No of Years : " + year );
        System.out.println("No of weeks: " + week);
        System.out.println("No of days: " + days);
		scanobj.close();
	}

}
