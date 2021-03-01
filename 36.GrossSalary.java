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
	      int n = sc.nextInt();
	      double hra, da, gs=0;
	      if (n <1500){
	          hra= 0.1 * n;
	          da= 0.9* n;
	          gs= n+ hra+da;
	      }
	      else {
	          hra= 500;
	          da= 0.98* n;
	          gs= n+ hra+da;
	      }
	      System.out.println(gs);
	  }
	}
}
