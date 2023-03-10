package com.Prgs.Matrix;
/*Write a Java program to find sum of main diagonal elements of a matrix.*/
public class Sum_Diagonal {

	   public static void main(String args[]){
		      int a[][]={{1,2,3},{4,5,6},{7,8,9}};
		     int sum1=0,sum2=0;
		   
		   System.out.println("Addition of  Diagonal  of  Matrices:");
		     for(int i = 0;i<3;i++){
		        for(int j = 0;j<3;j++){
		          if(i==j)
		           {
		                 sum1 =sum1+a[i][j];
		           }
		           if(i+j ==(3-1))
		           {
		                 sum2=sum2+a[i][j];
		           }
		      }
		  }
	System.out.println("Sum of the Diagonal is: "+(sum1+sum2));
  }
}

