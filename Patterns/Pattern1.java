package com.Prgs.Patterns;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Inverted Pyramid Star Pattern*/
		int i, j, k, m = 10;
		for(i = 1;i <= 5;i++)
		{
		for(j = 1;j < i;j++)
		{
			 System.out.print(" "); 
		}
		for(k = 1;k < m;k++)
		{
			 System.out.print("*"); 
		}
		m = m - 2;
		 System.out.print("\n"); 
		}
		/*Inverted Mirrored Right Triangle Star Pattern*/
		int a, b;
        for (a = 1; a<=7; a++)
        {
          for (b = 1; b < a; b++) 
          {
        	  System.out.print(" ");
          }
          for (b = a; b<7; b++) 
          {
        	  System.out.print("*" + " ");
          }
          System.out.println();
        }
        
        /*Hollow Inverted Mirrored Right Triangle Star Pattern*/
        int c,d;
        for(c=1;c<=5;c++)
        {
       	 for(d=1;d<=5;d++)
       	 {
       		if(d==5||d==c ||c==1)
       			System.out.print("*");
       		else
       			System.out.print(" ");
       	 }
        System.out.print("\n");
        }
        System.out.print("\n"); 
        /*Hollow Pyramid Star Pattern*/
        int e,f;
        for(e=1;e<=5;e++)
        {
        	for(f=1;f<=9;f++)
        	{
        		if(e+f==6 || f-e==4 || e==5)
        		{
        			System.out.print("*");
        		}
        		else {
        			System.out.print(" ");
        		}
        	}
        	System.out.print("\n");
        }
        /*Hollow Inverted Pyramid Star Pattern*/
   	 int g,h;
     for(g=1;g<=5;g++)
     {
     	for(h=1;h<=9;h++)
     	{
     		if(g+h==10 || g==h || g==1)
     		{
     			System.out.print("*");
     		}
     		else {
     			System.out.print(" ");
     		}
     	}
     	System.out.print("\n");
     }
     /*Half Diamond Star Pattern*/
     int n,l;
     for(n=1;n<=5;n++)
     {
     	for(l=1;l<=n;l++)
     	{
     		System.out.print("*");
     	}
     	System.out.print("\n");
     }
     
      for(l=1;l<=5;l++)
     {
     	for(n=5;n>=1;n--)
     	{
     	    if(n>=l)
     	    {
     		 System.out.print("*");
     	    }
     	    else
     	    {
     	     System.out.print(" ");
             }
     	}
     	System.out.print("\n");
     }
      
      /*Diamond Star Pattern*/
      int o,p,q,r=10;
      for(o=1;o<5;o++)
      {
     	 for(p=1;p<9;p++)
     	 {
     		 if(p>=6-o &&p<=4+o)
     		 { 
     			 System.out.print("*"); 
     		 }else {
     			 System.out.print(" "); 
     		 }
     	 }
     	 System.out.print("\n"); 
      }
		for(o = 1;o <= 5;o++)
		{
		for(p = 1;p < o;p++)
		{
			 System.out.print(" "); 
		}
		for(q = 1;q < r;q++)
		{
			 System.out.print("*"); 
		}
		r = r - 2;
		 System.out.print("\n"); 
		}
      /*Left Arrow Star Pattern*/
		int s,t;
        for(s=1;s<=5;s++)
        {
        	for(t=s;t<=5;t++)
        	{
        		System.out.print("*");
        	}
        	System.out.print("\n");
        }
        for(s=1;s<=5;s++) {
        	for(t=1;t<=s;t++) {
        		System.out.print("*");
        	}
        	System.out.print("\n");
        	}
        /*Right Arrow Star Pattern*/
        
        int u,v,w;
        for( u=0;u<5;u++)  
        {  
          for( v=0;v<u;v++)  
          {  
        	  System.out.print(" "); 
          }  
          for( w=1;w<=5-u;w++)  
          {  
        	  System.out.print("*");
          }  
          System.out.print("\n"); 
        }  
       for( u=1;u<5;u++)  
       {  
         for(v=1;v<5-u;v++)  
         {  
        	 System.out.print(" "); 
         }  
         for( w=1;w<=u+1;w++)  
         {  
        	 System.out.print("*"); 
         }  
         System.out.print("\n");  
       }  
      
       /*Left Arrow Star Pattern*/
       for( u=1;u<=5;u++)  
       {  
         for( v=1;v<=5-u;v++)  
         {  
       	  System.out.print(" "); 
         }  
         for( w=0;w<=5-u;w++)  
         {  
       	  System.out.print("*");
         }  
         System.out.print("\n"); 
       }  
      for( u=1;u<5;u++)  
      {  
        for(v=1;v<u+1;v++)  
        {  
       	 System.out.print(" "); 
        }  
        for( w=1;w<=u+1;w++)  
        {  
       	 System.out.print("*"); 
        }  
        System.out.print("\n");  
      }         
            
	}
}
