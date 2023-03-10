package com.Prgs.String;

public class RemoveSpace {
    public static void main(String[] args) {
        String s = "   Learning    Java   ";
         s =s.replaceAll("\\s+","");
         System.out.println("After Removing Spaces:"+s);
    }  
}

