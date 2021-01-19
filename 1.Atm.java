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
		//System.out.println("Enter the amount you want to withdraw");
		int x = sc.nextInt();
		//System.out.println("Enter the initial balance in your account");
		double y = sc.nextDouble();
	    double z= y- (x+0.5);
	    if(x%5!=0)
	   {
	       System.out.printf("%.2f",y);
	   }
	   
	   else if(x+0.5>y)
      {
          System.out.printf("%.2f", y);
      }
	   
	   else 
	   {
	        System.out.printf("%.2f",z);
	   }
		
	}
}
