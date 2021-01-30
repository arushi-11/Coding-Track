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
		int T= sc.nextInt();
		for(int i = 1;i<=T;i++)
		{
		    
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    int C = sc.nextInt();
		    
		    if((A>B&&A<C)||(A<B&&A>C))
		     System.out.println(A);
		    else if((B>A&&B<C)||(B<A&&B>C))
		    System.out.println(B);
		    else if((C>A&&C<B)||(C<A&&C>B))
		    System.out.println(C);
		}
	}
}
