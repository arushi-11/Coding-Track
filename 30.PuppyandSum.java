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
	    
	    while(t-->0){
	        int sum=0;
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        
	        for (int j =0; j<a; j++){
	            sum =0;
	            int k=b;
	            while(k!=0){
	                sum = sum+ k;
	                --k;
	            }
	           b= sum;
	        }
	        System.out.println(sum);
	    }
	    
	}
	
}
