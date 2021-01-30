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
		int[] arr = {2048,1024,512,256,128,64,32,16,8,4,2,1};
		for(int t = 0; t<n; t++){
		    int count = 0;
		    int num = sc.nextInt();
		    for(int i=0; i<arr.length; i++){
		        while(num >= arr[i]){
		            count++;
		            num -= arr[i];
		        }
		    }
		    System.out.println(count);
		}
		// your code goes here
	}
}
