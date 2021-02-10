/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		 Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i= 1; i<=t; i++) {
              String str = sc.next();
              char [] p,q;
              p = new char[str.length() /2];
              q = new char[str.length() /2];
              for(int j = 0; j<str.length()/2; j++){
                    if(str.length()%2 != 0){
                          p[j] = str.charAt(j);
                          q[j] = str.charAt(j+1+str.length()/2);
                          
                          
                    }else{
                        p[j]= str.charAt(j);
                        q[j] = str.charAt(j + str.length()/2);
                          
                    }
              }
              Arrays.sort(p);
              Arrays.sort(q);
              if(Arrays.equals(p,q)) System.out.println("YES");
              else System.out.println("NO");
              
              
              
              
            }
	}
}
