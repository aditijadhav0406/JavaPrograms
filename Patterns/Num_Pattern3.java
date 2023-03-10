package com.Prgs.Patterns;

public class Num_Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Pattern 34*/ 
		int r = 5;

	    for (int i = 1; i <= r; i++) {
	        for (int j = 1; j <= i; j++) {
	            if (j % 2 == 1) {
	                System.out.print("1");
	            } else {
	                System.out.print("0");
	            }
	        }
	        System.out.println();
	    }
	    System.out.println();

		/*Pattern 35*/
	    for (int i = 1; i <= r; i++) {
	        for (int j = 1; j <= i; j++) {
	            if (j == 1 || j == i || i == r) {
	                System.out.print("1");
	            } else {
	                System.out.print("0");
	            }
	        }
	        System.out.println();
	    }
	    System.out.println();
	    
		/*Pattern 36*/
	    
	    int num = 1;
	    for (int i = 1; i <= r; i++) {
	        for (int j = 1; j <= num; j++) {
	            System.out.print(j);
	        }
	        num += 2;
	        System.out.println();
	    }
	    System.out.println();
	    
		/*Pattern 37*/
	        for (int i = 1; i <= r; i++) {
	           
	            for (int j = 1; j <= i; j++) {
	                System.out.print(j);
	            }
	            
	            for (int j = i-1; j >= 1; j--) {
	                System.out.print(j);
	            }
	            System.out.println();
	        }
	        System.out.println();
	        
		/*Pattern 38*/
	        int n = 1;
	        for (int i = 1; i <= 5; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(n + "  ");
	                n++;
	            }
	            System.out.println();
	        }
	        System.out.println();
	        
		/*Pattern 39*/
	        for (int i = 1; i <= r; i++) {
	            int k = i;
	            for (int j = 1; j <= i; j++) {
	                System.out.print(k + " ");
	                k += r - j;
	            }
	            System.out.println();
	        }
	        System.out.println();
	        
		/*Pattern 40*/
	        for (int i = 1; i <= 5; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(i);
	            }
	            System.out.println();
	        }
	        for (int i = 4; i >= 1; i--) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(i);
	            }
	            System.out.println();
	        }

	}

}
