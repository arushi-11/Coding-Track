// https://practice.geeksforgeeks.org/contest-problem/sahil-love-good-scorer/0/


import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	   Scanner sc = new Scanner(System.in);
	   int t = sc.nextInt();

	   while(t-->0){

	       int a = sc.nextInt();
	       int b = sc.nextInt();
	       int[] arr1=new int[a];
           int[] arr2=new int[b];
           int sum1 = 0;
           int sum2 =0;
           //for(int i = arr1.length-1 ; i >0; i--){
	       for(int i =0; i<arr1.length; i++){
	            //int sum =0;
	            arr1[i]=sc.nextInt();
	            sum1 = sum1 + arr1[i];
	       }
	       //for (int j = arr2.length-1; j>0; j--){
	       for(int j =0; j<arr2.length; j++){

	            arr1[j]=sc.nextInt();
	            sum2 = sum2 + arr2[j];
	       }

	       if(sum1>sum2)
	           System.out.println("C1");
	       else
	           System.out.println("C2");
	       //--t;
	   }

	 }
}
