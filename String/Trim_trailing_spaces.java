package com.Prgs.String;
/*Write a Java program to trim trailing white space characters from given string*/
public class Trim_trailing_spaces {
	public static void main(String[] args) {
        String str = "Learning Java   ";
         
        if (str == null || str.length() == 0) {
            System.out.println(str);
        }
        int i = str.length() - 1;
        while (i >= 0 && Character.isWhitespace(str.charAt(i))) {
            i--;
        }
        
        System.out.println(str.substring(0, i + 1));
    }
}

