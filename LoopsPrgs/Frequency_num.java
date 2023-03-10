package com.Prgs.LoopsPrgs;
import java.util.Scanner;
public class Frequency_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Write a Java program to find frequency of each digit in a given integer.*/
		Scanner s =new Scanner(System.in);
		int no,tempc,count=0,digit,i;
        System.out.println("Enter a Number to check frequency: ");
       no=s.nextInt();
         System.out.println("Digit  Frequency");
         for( i=0;i<=9;i++)
         {
        	 count =0;
            tempc=no;
            while(tempc>0)
            {
            	digit=tempc%10;
                if(digit==i)
                {
                    count++;
                }
                tempc=tempc/10;
            }
            if(count>0)
              System.out.println(i+"\t\t"+count);
            s.close();
         }
         
	}

}
