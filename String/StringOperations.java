package com.Prgs.String;
/*
 * 1Write a Java program to find length of a string.
2.	Write a Java program to copy one string to another string.
3.	Write a Java program to concatenate two strings.
4.	Write a Java program to compare two strings.

5.	Write a Java program to convert lowercase string to uppercase.
6.	Write a Java program to convert uppercase string to lowercase.
*/
public class StringOperations {

public static void main(String[] args) {
		
		String s = "aditi";
		String s1 =new String("is learning");
		String s2=s;
		String s3 ="STUDYING";
	    System.out.println("Original String is "+ s);
	    //concatenate String
     	s=s.concat("jadhav");
	    System.out.println("Concatenated String is "+s);
	    //length of String
		System.out.println("Length of string "+ s + " is :" + s.length());
		//copy string
		System.out.println("Copied New String is "+ s2);
		//comparision
		if(s.equals(s1)){
		    System.out.println("Both are same ");
		}else{
		    System.out.println("Both are not same ");
		}
		//lower case
		
		System.out.println("Upper case is "+s1.toUpperCase());
		System.out.println("Lower Case is "+s3.toLowerCase());
	}
}

