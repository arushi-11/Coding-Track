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
        int e = 0;
        int o = 0;
        for(int i = 0;i<t;i++){
            int u = sc.nextInt();
            if(u%2==0)e++;
            else o++;
        }
        if(e>o)
        System.out.println("READY FOR BATTLE");
        else
        System.out.println("NOT READY");
		// your code goes here
	}
}
