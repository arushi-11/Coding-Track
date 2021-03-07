/* package codechef; // don't place package name! */
// https://www.codechef.com/problems/RECIPE

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
		public static int gcd(int n1,int n2)
    {
        if(n1==0)
         return n2;
         else if(n2==0)
          return n1;
         else
          return gcd(n2,n1%n2);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0)
	    {
	        int n=sc.nextInt();
	        int hcf=0;
	        int a[]=new int[n];
	        for(int i=0;i<n;i++)
	         a[i]=sc.nextInt();
	        for(int i=0;i<n;i++)
	        {
	            hcf=gcd(a[i],hcf);
	        }
	        for(int i=0;i<n;i++)
	        {
	           System.out.print(a[i]/hcf+" ");
	        }
	        System.out.println();

	    }
	}
}
