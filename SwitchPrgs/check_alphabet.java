package com.Prgs.SwitchPrgs;
import java.util.Scanner;
public class check_alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*3.	Write a Java program to check whether an alphabet is vowel or consonant using switch case.*/
		
		Scanner s = new Scanner(System.in);
		/*program to check Vowels*/
	       char ch;
	       System.out.println("Enter character to check if vowel or not ");
	       ch = s.next().charAt(0);
	       switch(ch) {
	       case 'a':
	       case 'e':
	       case 'i':
	       case 'o':
	       case 'u':
	    	   System.out.println("Is a Vowel !!");
	    	   break;
	      default:
	    	  System.out.println("Is a Consonent !!");
	    	   
	       }
	       s.close();
	}

}
