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
	  int n = sc.nextInt();
	  for(int i = 0; i<n; i++){
	      int f = 1;
	      int a= sc.nextInt();
	      for( int j=1; j<=a; ++j){   
	      //while(a!=0){
              f=f*j;  
              
            }    
	      System.out.println(f);
	  }
	}
}
