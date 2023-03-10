package com.Prgs.String;
/*15 Write a Java program to find last occurrence of a character in a given string.

*/
public class LastOccurance {
	public static void main(String[] args) {
	        
	        String s = "childrens are playing game";
	        char ch='l';
		    int find = findlast(s, ch);
		        if (find == -1) {
	            System.out.println("The character is not found in the string");
		        } else {
	            System.out.println("The character is last found at index "+find);
	        }
	    }
	
	    public static int findlast(String s, char ch) {
	        for (int i = s.length() - 1; i >= 0; i--) {
		            if (s.charAt(i) == ch) {
	                return i;
		            }
		        }
	        return -1;
		    }
	
		}


