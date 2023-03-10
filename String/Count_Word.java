package com.Prgs.String;
import java.util.Scanner;
/*10.	Write a Java program to count total number of words in a string. */
public class Count_Word {
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	 System.out.println("Enter the STRING:");
	 String sentence =s.nextLine();
	 int countwords=0;
	 String words[]= sentence.split("\\s+");
	 for(String word : words)
	 {
	     countwords++;
	 }
	System.out.println("Total no of Words are: "+countwords);
	s.close();
   }
}

