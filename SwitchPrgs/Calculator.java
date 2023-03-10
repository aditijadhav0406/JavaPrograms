package com.Prgs.SwitchPrgs;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*8.	Write a Java program to create Simple Calculator using switch case.*/
		Scanner s = new Scanner(System.in);
        int num1,num2,result;
        char op;
        System.out.println("Enter the operator(+,-,*,/) :");
        op =s.next().charAt(0);
        System.out.println("Enter two digits:");
        num1 =s.nextInt();
        num2 =s.nextInt();
         switch(op)
         {
         case '+':
        	 result =num1 + num2;
        	 System.out.println("Adition is :" +result);
        	 break;
         case '-':
        	 result =num1 - num2;
        	 System.out.println("Adition is :" +result);
        	 break;
         case '*':
        	 result =num1 * num2;
        	 System.out.println("Adition is :" +result);
        	 break;
         case '/':
        	 result =num1 / num2;
        	 System.out.println("Adition is :" +result);
        	 break;
        default:
        	System.out.println("Invalid operator");
            break;
         }
        s.close();
	}

}
