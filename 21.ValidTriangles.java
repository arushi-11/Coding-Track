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
		for(int i=0; i<t; i++){
		    int a= sc.nextInt();
		    int b= sc.nextInt();
		    int c= sc.nextInt();
		    int sum=0;
		    sum= a+b+c;
		    if(sum == 180){
		        System.out.println("YES");
		    }
		    else {
		        System.out.println("NO");
		    }
		    
		}
		// your code goes here
	}
}
