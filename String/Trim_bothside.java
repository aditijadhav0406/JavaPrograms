package com.Prgs.String;
/*37.	Write a Java program to trim both leading and trailing white space characters from given string.*/
public class Trim_bothside {
    public static void main(String[] args) {
        String str = "   Learning Java   ";
         
        if (str == null || str.length() == 0) {
            System.out.println(str);
        }
       int j=0;
        while(j < str.length() && Character.isWhitespace(str.charAt(j))){
            j++;
        }
         int i = str.length() - 1;
        while (i >= 0 && Character.isWhitespace(str.charAt(i))) {
            i--;
        }
        
        System.out.println(str.substring(j, i + 1) );
    }
}

