package com.Prgs.BasicPrg;
import java.util.*;
public class SI_CI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Write a Java program to enter P, T, R and calculate Simple Interest.
		18.	Write a Java program to enter P, T, R and calculate Compound Interest.*/

       Scanner scanobj =new Scanner(System.in);
       double p,rate ,t, SI ,CI;
       System.out.println("Enter principle ,rate,time :");
       p= scanobj.nextDouble();
       t =scanobj.nextDouble();
       rate =scanobj.nextDouble();
       SI = (p * rate * t)/100;
       CI = p*(Math.pow((1 + rate / 100), t)) -p;
       System.out.println("Simple interest is : " + SI);
       System.out.println("Compound interest is : " + CI);
       scanobj.close();
       
	}

}
