package com.Prgs.Ifelse;

import java.util.Scanner;
public class checkchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
7.Write a Java program to check whether a character is alphabet or not.
8.	Write a Java program to input any alphabet and check whether it is vowel or consonant.
9.	Write a Java program to input any character and check whether it is alphabet, digit or special character.
10.	Write a Java program to check whether a character is uppercase or lowercase alphabet.
       */
		Scanner s = new Scanner(System.in);
		/*check if vowels or not*/
		  char  ch;
	      System.out.println("Enter the character to check if vowels or not : ");
	      ch = s.next().charAt(0); 
	      if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'|| ch == 'u')
	      {
	    	  System.out.println("IS a vowels");
	    	  
	      }
	      else {
	    	  System.out.println("IS not a vowles");
	      }
		
		/*check if alphabet no or special character */
	      
	      System.out.println("Progrm to check Alphabet ,number or special character");
	      System.out.println("Enter the character :");
	      ch = s.next().charAt(0);
	      if((ch >='A' && ch <='Z') || (ch>='a' && ch<='z'))
	      
	    	  System.out.println("IS a alphabet");
	      else if(ch >=0 && ch<=9)
	    	  System.out.println( ch + " is a digit");
	      else
	    	  System.out.println( ch + " is special character");
	      
	      /*check if lower case or upper case */
	      System.out.println("Program to check upper case or lower case :");
	      System.out.println("Enter the character :");
	      ch = s.next().charAt(0); 
	      if(ch >='A' && ch <='Z' )
	    	  System.out.println(ch +" is upper case alphabet");
	      else if (ch>='a' && ch<='z') 
	    	  System.out.println(ch + " is not aupper case alphbet");
	      else
	    	  System.out.println(ch + " is not a alphabet");
	      s.close();
	}

}
