package com.Prgs.String;
/*7.	Write a Java program to toggle case of each character of a string.*/
public class ToggleCase {
    public static void main(String[] args) {
        String str = "This is a Sample String";
        StringBuilder toggledStr = new StringBuilder();
        
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            
            if (Character.isUpperCase(c)) {
                c = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                c = Character.toUpperCase(c);
            }
            
            toggledStr.append(c);
        }
        
        System.out.println("Original String: " + str);
        System.out.println("Toggled String: " + toggledStr.toString());
    }
}


