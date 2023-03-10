package com.Prgs.BasicPrg;
import java.util.Scanner;
public class Percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Write a Java program to enter marks of five subjects and calculate total, average and percentage.*/
		Scanner scanobj = new Scanner(System.in);
		int math,science,eng,hindi,marathi; 
        double total, average, percentage;
        System.out.println("Enter marks of five subjects out of 100:");
        math=scanobj.nextInt();
        science=scanobj.nextInt();
        eng=scanobj.nextInt();
        hindi=scanobj.nextInt();
        marathi=scanobj.nextInt();
        total = math + science + eng + hindi + marathi;
        average = (total / 5.0);
        percentage = (total / 500.0) * 100;
        System.out.println("Total marks of all subjects = "+ total);
        System.out.println("Average marks of all subjects= "+ average);
        System.out.println("Percentage of all subjects = "+ percentage);
        scanobj.close();
	}

}
