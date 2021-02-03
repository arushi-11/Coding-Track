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
		while(t-->0) {
		    long a = sc.nextInt();
		    long b = sc.nextInt();
		    long num, den,rem, gcd, lcm;
		    if (a>b){
		        num= a;
		        den= b;
		    }
		    else{
		        num= b;
		        den= a;
		    }
		    rem = num%den;
		    
		    while(rem!=0){
		        num = den;
		        den= rem;
		        rem= num%den;
		    }
		    
		    gcd= den;
		    lcm = a*b/gcd;
		    System.out.println(gcd+ " " +lcm);
		    
		}	
	}
}
