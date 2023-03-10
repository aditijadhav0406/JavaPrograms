package com.Prgs.Patterns;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Square Star Pattern*/
         for(int i=1;i<5;i++)
         {
        	 for(int j=1;j<5;j++)
        	 {
        		 System.out.print("*");
        	 }
        	 System.out.println();
         }
         System.out.print("\n");
         /*Hollow Square Star Pattern*/
         for (int a = 1; a <= 5; a++) {
 			for (int b = 1 ; b <= 5; b++) 
 				if((a==1 || a==5) || (b==1 || b==3))
 				   System.out.print("*");
 				else
 			       System.out.print(" ");
 			
 			System.out.println();
 		}
         System.out.print("\n");
         /*Hollow Square Star Pattern with Diagonal*/
         int n,m;
         for(m=5; m>=3;m--){
             for(n=1;n<=m;n++){
                 System.out.print("*");
             }
             System.out.print("\n");
           }

         for(m=5-1; m<=5-1;m++){
             for(n=1;n<=m;n++){
            	 System.out.print("*");
             }
             System.out.print("\n"); 
         }
         System.out.print("\n");
         
         /*Mirrored Rhombus Star Pattern*/
         int l,k;
         for (l = 0; l < 5; l++) {
          
             for (k = 0; k < l; k++) {
            	 System.out.print(" ");
             }
            
             for (k = 0; k < 5; k++) {
            	 System.out.print("*");
             }
             
             System.out.print("\n");
         }
         System.out.print("\n");
		   /*Hollow Rhombus Star Pattern*/
         int i,j;
         for ( i=0; i < 5; i++)
         {
           for ( j=0; j <5 - i; j++)
             System.out.print(" ");
           for (j=0; j < 5; j++)
           {
             if (i == 0 || i == 5-1 || j == 0 || j == 5-1)
            	 System.out.print("*");
             else 
            	 System.out.print(" ");
           }
           System.out.print("\n");
         }
         /*Rhombus Star Pattern*/
         int o,p;
         for (o = 0; o < 5; o++) {
          
             for (p = 0; p <5-o; p++) {
            	 System.out.print(" ");
             }
            
             for (p = 1; p <=5; p++) {
            	 System.out.print("*");
             }
             
             System.out.print("\n");
         }
		 /*Hollow Mirrored Rhombus Star Pattern*/
         int f,g;
         for ( f=0; f < 5; f++)
         {
           for ( g=0; g <5 + f; g++)
             System.out.print(" ");
           for (g=0; g < 5; g++)
           {
             if (f == 0 || f == 5-1 || g == 0 || g == 5-1)
            	 System.out.print("*");
             else 
            	 System.out.print(" ");
           }
           System.out.print("\n");
         }
         /*Right Triangle Star Pattern*/
         int c,d;
         for(c=1;c<=5;c++)
         {
        	 for(d=1;d<=5;d++)
        	 {
        		 if(d<=c)
        		 {
        			 System.out.print("*"); 
        		 }
        		 else {
        			 System.out.print(" ");
        		 }
        	 }
        	 System.out.print("\n");
         }
		  /*Hollow Right Triangle Star Pattern*/ 
        
         int v,w;
         for(v=1;v<=5;v++)
         {
        	 for(w=1;w<=v;w++)
        	 {
        		if(w==1||v==w ||v==5)
        			System.out.print("*");
        		else
        			System.out.print(" ");
        	 }
         System.out.print("\n");
         }
         System.out.print("\n");
         
         /*Pyramid Star Pattern*/
         int x,y;
         for(x=1;x<5;x++)
         {
        	 for(y=1;y<9;y++)
        	 {
        		 if(y>=6-x &&y<=4+x)
        		 { 
        			 System.out.print("*"); 
        		 }else {
        			 System.out.print(" "); 
        		 }
        	 }
        	 System.out.print("\n"); 
         }
         System.out.print("\n"); 
         /*Hollow Mirrored Right Triangle Star Pattern*/
         int q,r;
       
         for(q=1;q<=5;q++)
         {
        	 for(r=q;r<5;r++)
        	 {
        		 System.out.print(" ");
        	 }
        		 for(r=1; r<=q; r++)
        		 {
        		if(q==5||q==r ||r==1)
        			System.out.print("*");
        		else
        			System.out.print(" ");
        	 }
         System.out.print("\n");
         }
         System.out.print("\n"); 
      /*Inverted Right Triangle Star Pattern*/ 
     	int s,t;
        for(s=1;s<=5;s++)
        {
       	 for(t=5;t>=1;t--)
       	 {
       		 if(s<=t)
       		 {
       			 System.out.print("*"); 
       		 }
       		 else {
       			 System.out.print(" ");
       		 }
       	 }
       	 System.out.print("\n");
        }
        System.out.print("\n"); 
        /*Hollow Inverted Right Triangle Star Pattern*/
        int h,u;
        for(h=1;h<=5;h++)
        {
       	 for(u=5;u>=h;u--)
       	 {
       		if(u==5||h==u ||h==1)
       			System.out.print("*");
       		else
       			System.out.print(" ");
       	 }
        System.out.print("\n");
        }
        System.out.print("\n"); 
       
       
        	
        
        
        
        
        
	}        
	

}
