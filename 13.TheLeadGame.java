/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int Si=0, Ti=0, lead=0, winner=0;
		
		while(n-->0){
		    int p1 = sc.nextInt();
		    int p2 = sc.nextInt();
		    Si=Si+p1;
		    Ti=Ti+p2;
		    int currLead = Si-Ti;
		    
		    if (currLead >0 && currLead>=lead){
		        winner = 1;
		        lead = currLead;
		    } else if( currLead <0 && (-currLead)>=lead){
		        winner = 2;
		        lead = -currLead;
		    }
		}
		System.out.println(winner+" "+lead); 
	}
}
