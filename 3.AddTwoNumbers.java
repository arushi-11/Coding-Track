
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    //no of iterations
	    int n = sc.nextInt();
	    int ans = 0;
	    for (int i = 0; i<n; i++){
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        ans = a+b;
	        System.out.println(ans);
	    }
	}
}