/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc =new Scanner(System.in);
		int t =sc.nextInt();
	    
		for(int i=0; i<t; i++)
		{
		   int num = sc.nextInt();
           int n = num ;
           int x  ,z =0;
           while(n!=0){
           x = n%10 ;
           z = z*10+x;
           n= n/10;
        }
        
        if(z==num)
            System.out.println("wins");
        else
            System.out.println("loses");
		}
	    
	}
	}

