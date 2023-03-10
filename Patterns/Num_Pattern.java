package com.Prgs.Patterns;

public class Num_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Number Pattern 1*/
		for(int a=1;a<=5;a++)
        {
            for(int b=1;b<=5;b++)
            {
                System.out.print("1");
            }
            System.out.println(" ");
        }
		System.out.println();

		//pattern 2
		for(int a=1;a<=5;a++)
        {
            for(int b=1;b<=5;b++)
            {
                if(a==1 ||a==3 ||a==5)
                {
                    System.out.print("1"); 
                }else{
                System.out.print("0");
                }
            }
            System.out.println();

        }
		System.out.println();

            
             //pattern 3
      int c,d;
        for( c=1;c<=5;c++)
          {
             for( d=1;d<=5;d++)
               {
                 if(d==1 ||d==3 ||d==5)
                   {
                      System.out.print("0"); 
                   }else{
                        System.out.print("1");
                       }
                }
                System.out.println(" ");
          }
          System.out.println();

          //pattern 4
   int e,f;
   for( e=1;e<=5;e++)
     {
      for(f=1;f<=5;f++)
       {
        if(f==1||f==5 ||e==1||e==5)
          {
            System.out.print("1"); 
          }else{
             System.out.print("0");
               }
        }
         System.out.println(" ");
     }
      System.out.println();

                //pattern 7
      int g,h;
      for(g=1;g<=5;g++)
        {
          for( h=1;h<=5;h++)
             { 
              if(g==3 ||h==3)
                {
                   System.out.print("0");
                }else{
                       System.out.print("1");
                    }
             }
              System.out.println(" ");
         }
                System.out.println();

              //pattern 8
      int i,j;
       for(i=1;i<=5;i++)
        {
          for(j=1;j<=5;j++)
            { 
              if(i==j ||i+j==6)
                {
            	  System.out.print("1");
                }else{
                      System.out.print("0");
                     }
            }
              System.out.println(" ");
         }
         System.out.println();

                //pattern 9
       int k,l;
       for(k=1;k<=5;k++)
         {
          for(l=1;l<=5;l++)
            {
             if((l==1&&k==1)||(l==5&&k==5)||(l==1&&k==5)||(l==5&&k==1))
                {
                 System.out.print("0");
                }
             else if((l==1||l==5 ||k==1||k==5))
                {
                 System.out.print("1"); 
              }else{
                  System.out.print("0");
                   }
            }
             System.out.println(" ");
         }
          System.out.println();


        //pattern 10
                int m,n;
                for(m=1;m<=5;m++)
                {
                    for(n=1;n<=5;n++)
                    { 
                        System.out.print(m);
                    }
                    System.out.println("");
                }

                System.out.println();

                //pattern 11
                int o,p;
                for(o=1;o<=5;o++)
                {
                    for(p=1;p<=5;p++)
                    { 
                        System.out.print(p);
                    }
                    System.out.println("");
                }
                System.out.println();

                //pattern 12
   int q,r,count=1;
  for(q=1;q<=5;q++) 
  {
    for(r=1;r<=5;r++)
       {
         if(r==1&&q!=1) {
             count=q+r-1;
             System.out.print(count);
             count++;
               }
          else {
             System.out.print(count);
              count++;
               }
        }
         System.out.println();
  }
    System.out.println();

                //pattern 13
    int s,t;
    for(s=1;s<=5;s++)
     {
       for(t=1;t<=5;t++) 
       {
          System.out.print(" "+count);
               count++;
        }
          System.out.println();
      }
          System.out.println();                          

            
	//pattern 14
	int u,v;
    for(u=1;u<=5;u++){
        for(v=5;v>5-u;v--)
        {
            
                 System.out.print(v);
            
        }
        for(v=1;v<=5-u;v++)
        {
            System.out.print(5-u+1);
        }
        System.out.println();
    }
    System.out.println();

    //pattern 15
    int w,x;
    for(w=1;w<=5;w++){
        for(x=w;x<=5;x++)
        {
            
                 System.out.print(x);
            
        }
        for(x=w;x>1;x--)
        {
            System.out.print(5);
        }
        System.out.println();
    }
    System.out.println();
    
      //pattern 16  
    int y,z;
    for(y=1;y<=5;y++){
        for(z=y;z<=5;z++)
        {
            
                 System.out.print(z);
            
        }
        for(z=y-1;z>=1;z--)
        {
            System.out.print(z);
        }
        System.out.println();
    }
	}

}
