package com.Prgs.BasicPrg;
import java.util.Scanner;
public class Triangle_angle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Write a Java program to enter two angles of a triangle and find the third angle.
         14.	Write a Java program to enter base and height of a triangle and find its area.   
      */
		Scanner scanobj = new Scanner(System.in);
		int a1,a2,a3;
        System .out .println("Enter two angles : ");
        a1 = scanobj.nextInt();
        a2 = scanobj.nextInt();
        a3 = 180 - (a1 + a2);  
        System.out.println("Third angle is : " + a3);  
         /*Area of Triangle */
        int basee,height,areaTriangle;
        System .out .println("Enter base and height : ");
        basee = scanobj.nextInt();
        height = scanobj.nextInt();
        areaTriangle = (1/2 * basee * height);  
        System.out.println("Area of Triangle  is : " + areaTriangle);
        scanobj.close();
		
		
		
	}

}
