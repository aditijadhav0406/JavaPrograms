package com.Prgs.String;
/*9.	Write a Java program to count total number of vowels and consonants in a string.*/
public class Count_Vowles_Cosonants {
	public static void main(String[] args) {
	 String sh ="abc123@tt";
	 int countvowles=0,countconsonent=0;
	for(int i=0;i<sh.length();i++)
	{
	    char ch =sh.charAt(i);
	    if (ch =='a' || ch=='e'||ch =='i' ||ch=='o'||ch=='u') {
                 countvowles++;
           }else {
               countconsonent++;
            } 
	}
        System.out.println("Total  no of vowels : " + countvowles);
        System.out.println("Total  no of Consonent : " + countconsonent);
}
}

