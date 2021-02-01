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
		//int t =sc.nextInt();
	//	for(int i=0; i<t; i++){
		    int n =sc.nextInt();
		    if(n>=0 && n<=1000){
		       if(n%4==0){
		        System.out.println(n+1);
		        
		    }
		    else{
		        System.out.println(n-1);
		    }
		    }
	//	}
		// your code goes here
	}
}
