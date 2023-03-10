package com.Prgs.Functions;
/*Java program to find diameter, circumference and area of circle using functions.*/
public class Circle {
		static double  circumference(int r) {
	         double circum =2*3.14*r;
	         return circum;
	     }
	     static double  area(float r){
	         double cirarea =3.14*r*r;
	         return cirarea;
	     }    
	    
	    
	    
		public static void main(String[] args) {
		 double circumferences =circumference(5);
			double areaa = area(5);
			System.out.println("circumference is:" +circumferences);
				System.out.println("area is:" +areaa);
		}
}
