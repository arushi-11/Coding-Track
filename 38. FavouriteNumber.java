// Favourite number = 5

import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
     Scanner sc = new Scanner(System.in);
     int t,a;
     t= sc.nextInt();
     for (int i=0; i<t; i++){
       int n= sc.nextInt();
       int count=0;
       while(n!=0){
         a=n%10;
         n=n/10;
         if (a==5){
          count++;
         }
         else {}
       }
       System.out.println(count);
        
     }
     
      
    }
  }