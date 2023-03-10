package com.Prgs.String;
import java.util.*;
/*Write a Java program to find reverse of a string.*/
public class ReverseString {
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	 System.out.println("Enter the STRING:");
	 String word =s.nextLine();
	 String reversed = "";
       for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
       }
        System.out.println("Reversed string: " + reversed);
        s.close();
   }
}

