import java.util.*;
import java.lang.*;
import java.io.*;

// Remember that the class name should be "Main" and should be "public".
public class Main {
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int k = sc.nextInt();
	     
	    int count=0;
	    try {
	    for (int i = 0; i <n; i++)
	     { int x = sc.nextInt();
	       if (x%k ==0){
	           count++;
	       }
	     }
	    
	    System.out.println(count);
	}catch(Exception e){
	    return;
	}
	}
}

	     
	
	