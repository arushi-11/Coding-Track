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
		int t =sc.nextInt();
		//int count=0;
		for(int i=0;i<t; i++){
		    int n = sc.nextInt();
		    int count=0;
		    for(int j=1; j<=n; j++){
		        if(n%j==0)
		          count++;
		        }
		        
		   if(count==2)
		      System.out.println("yes");
		   else
		     System.out.println("no");
		}
		
	}
}
