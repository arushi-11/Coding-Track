/* Alice and Bob each created one problem . A reviewer rates the two
challenges, awarding points on a scale from 1 to 100 for three
categories: problem clarity, originality, and difficulty.The rating
for Alice's challenge is the triplet a = (a[0], a[1], a[2]), and the
rating for Bob's challenge is the triplet b = (b[0], b[1], b[2]).The
task is to find their comparison points by comparing a[0] with b[0],
a[1] with b[1], and a[2] with b[2].
● If a[i] > b[i], then Alice is awarded 1 point.
● If a[i] < b[i], then Bob is awarded 1 point.
● If a[i] = b[i], then neither person receives a point.
Comparison points is the total points a person earned. Given a and
b, determine their respective comparison points.
*/


package rating;

import java.util.Scanner;
import java.io.*;
//import java.util.*;
//import java.text.*;
//import java.math.*;

public class rating1 {
	public static void main(String args[]) {
      //System.out.println("hello world");
		 Scanner sc = new Scanner(System.in);
		   int a[] = new int[4];
		   int b[]  = new int[4];
		 //System.out.println("hello world");
		   
		   //int[] rating = [0,0];
		   
		   int alex =0;
		   int bob = 0;
		   
		   int i =0;
		   int j =0;
		   for ( i =0; i< 3; i++){
		       a[i] = sc.nextInt();
		   }    
		   for ( j =0; j< 3; j++){
			     //  a[i] = sc.nextInt();    
		       b[j] = sc.nextInt();
		   }
		   
		   for( i =0; i<3; i++) {
		       if(a[i] > b[i]){
		           alex++;
		           } 
		       else if(a[i] == b[i]){
		          // pass;
		       } 
		       else {
		          bob++;
		       }
		   } 
		 System.out.println(alex +" "+ bob);      
		       
		   }
	//System.out.println(" ");
}


