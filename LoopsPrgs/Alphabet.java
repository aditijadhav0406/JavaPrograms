package com.Prgs.LoopsPrgs;
import java.util.Scanner;
public class Alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*3.	Write a Java program to print all alphabets from a to z. - using while loop*/
		Scanner s =new Scanner(System.in);
		/*print A TO Z*/
        char ch;
        ch= 'a';
        System.out.println("Alphabets from A To Z:");
        while(ch<='z')
        {
     	   
     	   System.out.println(ch);
     	   ch++;
        }
        s.close();
	}

}
