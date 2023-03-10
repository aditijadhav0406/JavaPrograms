package com.Prgs.Matrix;

public class Transpose {
	   public static void main(String args[]){
	        int row = 3, col = 3;
	      int a[][]={{1,2,3},{4,5,6},{7,8,9}};
	     
	    System.out.println("Matrix before transpose:");
	      for(int i = 0; i < col; i++)
	    	{
	      	    for(int j = 0; j < row; j++)
	            {
	                System.out.print(a[j][i]+" ");
	            }
	            System.out.println(" ");
	    	}
	     System.out.println("Matrix after transpose:");
	      for(int i = 0; i < col; i++)
	    	{
	      	    for(int   j = 0; j < row; j++)
	            {
	                System.out.print(a[j][i]+" ");
	            }
	            System.out.println(" ");
	    	}
	      
	   }
	}


