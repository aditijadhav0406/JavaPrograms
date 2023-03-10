package com.Prgs.Ifelse;
import java.util.Scanner;
public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*19.	Write a Java program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to following:
                Percentage >= 90% : Grade A
                Percentage >= 80% : Grade B
                Percentage >= 70% : Grade C
                Percentage >= 60% : Grade D
                Percentage >= 40% : Grade E
                Percentage < 40% : Grade F
           */
		Scanner s = new Scanner(System.in);
		int phy,chem,biology,math,computer; 
        double total, percentage;
        System.out.println("Enter marks of five subjects out of 100(phy,chem,biology,math,computer):");
        phy = s.nextInt();
        chem = s.nextInt();
        biology= s.nextInt();
        math = s.nextInt();
        computer = s.nextInt();
        total = phy  + chem + biology + math + computer ;
     
        percentage = (total / 500.0) * 100;
        if(percentage >= 90)
      	  System.out.println("Grade :A");
        else if(percentage >= 80)
      	  System.out.println("Grade : B");
        else if(percentage >=70)
      	  System.out.println("Grade : C");
        else if(percentage >=60)
      	  System.out.println("Grade : D");
        else if(percentage >=50)
      	  System.out.println("Grade : F");
        else
      	  System.out.println("Fail !!");
        s.close();
		
	}

}
