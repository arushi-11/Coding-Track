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
		while(t>0){
		    int n = sc.nextInt();
		    int r = n%10;
		    int q = 0;
		    while(n>0){
		        q = n%10;
		        n=n/10;
		    }
		    int s = r + q;
		    System.out.println(s);
		    t--;
		}
	}
}