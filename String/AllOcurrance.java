package com.Prgs.String;
/*Write a Java program to search all occurrences of a character in given string.*/
public class AllOcurrance {
	public static void main(String[] args) {
		 String s ="childrens are learning java ";
		 char find ='e';
		 int count=0,i;
		 for( i=0;i<s.length();i++)
		 {
		     if(find==s.charAt(i))
		     {
		         count++;
		         System.out.println("Character is at postion "+i);
		     }
		 }
		 if(count==0)
		 {
		     System.out.println("Character is not present in string");
		 }else{
		     System.out.println("Character" +find + "occured :" +count+" times");
		 }
		}
	}

