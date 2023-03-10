package com.Prgs.Patterns;
public class Num_Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      /*Pattern 19*/
	    int r = 5;

	    for (int i = 1; i <= r; i++) {
	        for (int j = 1; j <= i; j++) {
	            System.out.print(i);
	        }
	        System.out.println();
	    }
	    System.out.println();
	    
		/*Pattern 20*/

	    for (int i = r; i >= 1; i--) {
	        for (int j = 1; j <= i; j++) {
	            System.out.print(r - i + 1);
	        }
	        System.out.println();
	    }
	    System.out.println(); 
	    
		/*Pattern 21*/

	    for (int i = r; i >= 1; i--) {
	        for (int j = 1; j <= i; j++) {
	            System.out.print(i);
	        }
	        System.out.println();
	    }

	    System.out.println();
	    
		/*Pattern 22*/
	    
	    for (int i = 1; i <= r; i++) {
	        for (int j = 1; j <= i; j++) {
	            System.out.print(r - i + 1);
	        }
	        System.out.println();
	    }

	    System.out.println();
	    
	   /*Pattern 23*/
	    
	    for (int i = 1; i <= r; i++) {
	        for (int j = 1; j <= i; j++) {
	            System.out.print(j);
	        }
	        System.out.println();
	    }

	    System.out.println();
	    
		/*Pattern 24*/
	    
	    for (int i = r; i >= 1; i--) {
	        for (int j = 1; j <= i; j++) {
	            System.out.print(j);
	        }
	        System.out.println();
	    }
	    System.out.println();
	    
		/*Pattern 25*/
	    
	    for (int i = 1; i <= r; i++) {
	        for (int j = i; j >= 1; j--) {
	            System.out.print(j);
	        }
	        System.out.println();
	    }

	    System.out.println();
		/*Pattern 26*/
	    
	    for (int i =r; i >= 1; i--) {
	        for (int j = i; j >= 1; j--) {
	            System.out.print(j);
	        }
	        System.out.println();
	    }

	    System.out.println();
	    /*Pattern 27*/
	    
	    for (int i = 1; i <= r; i++) {
	        for (int j = r; j >= r-i+1; j--) {
	            System.out.print(j);
	        }
	        System.out.println();
	    }
	    System.out.println();
	    /*Pattern 28*/
	    
	    for (int i = r; i >= 1; i--) {
	        for (int j = r; j >= i; j--) {
	            System.out.print(j);
	        }
	        System.out.println();
	    }
	
	    System.out.println();
		    /*Pattern 30*/   
	    
	    for (int i = r; i >= 1; i--) {
		        for (int j = i; j <= r; j++) {
		            System.out.print(j);
		        }
		        System.out.println();
		    }
		    System.out.println();
	}

}
