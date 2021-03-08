import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
     Scanner sc= new Scanner(System.in);
     int x,y,z;
     x= sc.nextInt();
     y= sc.nextInt();
     z= sc.nextInt();
     //a is the second largest
     if (x<=y && x<=z){
       if (y<=z){
         System.out.print(y);
       }
       else 
       System.out.print(z);
       }
       else if (y<=x && y<=z){
       if (x<=z){
         System.out.print(x);
       }
       else 
       System.out.print(z);
       }
       else if (z<=y && z<=x){
       if (y<=x){
         System.out.print(y);
       }
       else 
       System.out.print(x);
       }
     
    }
  }