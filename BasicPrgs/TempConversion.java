package com.Prgs.BasicPrg;
import java.util.Scanner;
public class TempConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Write a Java program to enter temperature in Celsius and convert it into Fahrenheit.*/
		Scanner scanobj = new Scanner(System.in);
		float fahrenheit ,celsius;
        System.out.println("Enter Celsius :");
        celsius = scanobj.nextFloat();
        fahrenheit= ((celsius*9)/5)+32;
        System.out.println("Temperature in Fahrenheit is: "+ fahrenheit);  
        
        /*Convert  fahrenheit to Celsius  */
       
        System.out.println("Enter Fahrenheit :");
        fahrenheit = scanobj.nextFloat();
        celsius = ((fahrenheit-32)*5)/9;
        
        System.out.println("Temperature in Celsius is: "+ celsius);
        
		
		scanobj.close();
		
	
	}

}
