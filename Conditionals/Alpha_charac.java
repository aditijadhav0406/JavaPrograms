package com.Prgs.Conditionals;
import java.util.Scanner;

public class Alpha_charac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		char  ch;
	      System.out.println("Enter the character");
	      ch = s.next().charAt(0); 
	      if((ch >='A' && ch <='Z') || (ch>='a' && ch<='z'))
	      {
	    	  System.out.println("IS a alphabet");
	    	  
	      }
	      else {
	    	  System.out.println("IS not a alphabet");
	      }
		s.close();

	}

}
