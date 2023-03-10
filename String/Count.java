package com.Prgs.String;
/*8.	Write a Java program to find total number of alphabets, digits or special character in a string.*/
public class Count {
	public static void main(String[] args) {
	 String sh ="abc123@tt";
	 int countletter=0,countdigit=0,countspecial=0;
	for(int i=0;i<sh.length();i++)
	{
	    char ch =sh.charAt(i);
	    if (Character.isLetter(ch)) {
                countletter++;
            } else if (Character.isDigit(ch)) {
                countdigit++;
            } else {
                countspecial++;
            }
    }

        System.out.println("Total no of  Alphabets in string:  " + countletter);
        System.out.println("Total  no of Digits : " + countdigit);
        System.out.println("Total  no of Special Characters : " + countspecial);
	}	
}

