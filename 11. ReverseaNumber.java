/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   Scanner sc = new Scanner(System.in);
	   int t= sc.nextInt();
	   int sum=0;
	   for (int i=0; i<t; i++){
	       int x = sc.nextInt();
		   while(x>0)
		    {
		        int a = x%10;
		        sum = sum*10+a;
		        x=x/10;
		    }
		    
		   System.out.println(sum);
		   sum = 0;
	   }
	   // your code goes here
	}
}
