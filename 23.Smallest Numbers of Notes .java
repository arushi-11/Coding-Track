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
		int arr[]= {100,50,10,5,2,1};
		//int sum=0;
		for(int i =0; i<t; i++){
		    int num = sc.nextInt();
		    int sum=0;
		    //int arr[]= {100,50,10,5,2,1}
		    for (int j=0; j<arr.length; j++ ){
		        sum = sum+num/arr[j];
		        num= num%arr[j];
		    }
		    System.out.println(sum);
		}
	}
}
