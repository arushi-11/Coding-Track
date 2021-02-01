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
		for(int i=0; i<t; i++){
		    char n=sc.next().charAt(0);
		    if(n=='b' || n=='B')
		      System.out.println("BattleShip");
		    else if (n=='c' || n=='C')
		      System.out.println("Cruiser");
		    else if (n=='d' || n=='D')    
		      System.out.println("Destroyer");
		   else if (n=='f' || n=='F')
		      System.out.println("Frigate");
		}
	}
}
