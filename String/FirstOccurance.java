package com.Prgs.String;
/*Write a Java program to find first occurrence of a character in a given string.*/
public class FirstOccurance {
	public static void main(String[] args) {
		 
		 String s ="dolly";
		 char find ='l';
		 int count=0,i;
		 for( i=0;i<s.length();i++)
		 {
		     if(find==s.charAt(i))
		     {
		         count++;
		         break;
		     }
		 }
		 if(count==0)
		 {
		     System.out.println("Character is not present in string");
		 }else{
		     System.out.println("Character is at position:" +i);
		 }
		 
		}
	
	}


