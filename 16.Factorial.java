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
	    int t = sc.nextInt();
	    for (int i=0; i<t; i++){
	        int ans =0;
	        int n=sc.nextInt();
		    int fact=1;
		    for(int j=1;j<=n;j++){
		        fact*=j;
		    }
		    System.out.println(fact);   
	    }
		// your code goes here
	}
}
