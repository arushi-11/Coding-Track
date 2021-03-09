// https://www.prepbytes.com/panel/mycourses/program-one/java/week/1/iteration-statements/codingAssignment/PRFCTNO

import java.util.*;
import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
    Scanner sc = new Scanner(System.in); 
    //int Sum = 0 ;
    int t= sc.nextInt(); //Test cases
    while(t-->0){
		int n = sc.nextInt();
		int Sum=0;
		for(int i = 1 ; i < n ; i++) {
			if(n % i == 0)  {
				Sum = Sum + i;
			}
		}
		if (Sum == n) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
}
}
   