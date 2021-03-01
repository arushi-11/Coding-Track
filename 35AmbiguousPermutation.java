/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner (System.in) ;
while(true) {
int n=sc.nextInt() ;
if(n==0) 
break;
int[] arr1=new int[n+2];
int[] arr2=new int[n+2];
for(int i=1;i<=n;i++) {
arr1[i]=sc.nextInt() ;
arr2[arr1[i]]=i;
}
if(Arrays.equals(arr1,arr2)) {
System.out.println("ambiguous") ;
}
else{
System.out.println("not ambiguous") ;
}  }
	}
}
