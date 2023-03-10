package com.Prgs.Ifelse;
import java.util.Scanner;
public class Gross_Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*20.	Write a Java program to input basic salary of an employee and calculate its Gross salary according to following:
                 Basic Salary <= 10000 : HRA = 20%, DA = 80%
                 Basic Salary <= 20000 : HRA = 25%, DA = 90%
                  Basic Salary > 20000 : HRA = 30%, DA = 95%
        */
		Scanner s = new Scanner(System.in);
		/*Profit and loss*/
        int cp,sp;
        System.out.println("Enter Cost Price & Selling Price ");
        cp =s.nextInt();
        sp =s.nextInt();
        
        if(sp>cp)
      	  System.out.println("Profit !!");
        else
      	  System.out.println("Loss !!");
        
		/*Gross Salary*/
        System.out.println("Enter the basic Salary: ");
       int basicSalary =s.nextInt();
       float hra,da;
       if(basicSalary <=10000) {
       	hra =basicSalary*0.2f;
           da =basicSalary*0.8f;
       }
       else if(basicSalary <=20000) {
       	hra =basicSalary *0.25f;
           da =basicSalary*0.9f;
       }
        else {
       	 hra =basicSalary*0.3f;
            da = basicSalary*0.95f;
        }
            System.out.println("Gross Salary :" +(basicSalary+hra+da));
            
		s.close();
	}

}
