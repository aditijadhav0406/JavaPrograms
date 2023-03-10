package com.Prgs.Matrix;
/*23.	Write a Java program to add two matrices.
24.	Write a Java program to subtract two matrices.
25.	Write a Java program to perform Scalar matrix multiplication.
26.	Write a Java program to multiply two matrices.
27.	Write a Java program to check whether two matrices are equal or not.
*/
public class Matrix_Operations {

	   public static void main(String args[]){
		      int a[][]={{1,2,3},{4,5,6},{7,8,9}};
		      int b[][]={{10,11,12},{13,14,16},{7,8,9}};
		      int c[][]=new int[3][3];
		      int mat_equal=1;
		   
		     System.out.println("Addition of Two Matrices:");
		      for(int i = 0;i<3;i++){
		         for(int j = 0;j<3;j++){
		            c[i][j] = a[i][j]+b[i][j];
		            System.out.print(c[i][j]+" ");
		         }
		         System.out.println();
		      }
		      
		     System.out.println("Substraction  of Two Matrices:");
		      for(int i = 0;i<3;i++){
		         for(int j = 0;j<3;j++){
		            c[i][j] = b[i][j] -a[i][j];
		            System.out.print(c[i][j]+" ");
		         }
		         System.out.println();
		      }
		      System.out.println("Multiplicatipn of Two Matrices:");
		      for(int i = 0;i<3;i++){
		         for(int j = 0;j<3;j++){
		            c[i][j] = b[i][j] * a[i][j];
		            System.out.print(c[i][j]+" ");
		         }
		         System.out.println();
		      }
		      int num =5;
		      System.out.println("\nMatrix after Scalar Multiplication are :");
				for(int i = 0; i < a.length ; i++)
				{
					for(int j = 0; j < a[0].length; j++)
					{
						System.out.print( " "+(num * a[i][j]));
					}
					System.out.print("\n");
				}
		      System.out.println("Check whether two matrix are same");
		      for(int i = 0;i<3;i++){
		         for(int j = 0;j<3;j++){
		                  if(a[i][j] != b[i][j]) {
							mat_equal = 0;
							break;
		                  }
		               }
		        }
		        if(mat_equal == 1) {
					System.out.println("\n Matrix a ==b ");
				}
				else {
					System.out.println("Matrix a != b");
				}
		      
		      
		   }
		}

