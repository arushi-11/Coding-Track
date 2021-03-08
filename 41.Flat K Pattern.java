/* Pattern-
1        1
12      21
123    321
1234  4321
1234554321
*/

// https://www.prepbytes.com/panel/mycourses/program-one/java/week/1/iteration-statements/codingAssignment/PRFCTNO

import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      char ch;
      Scanner sc = new Scanner(System.in);
      ch = sc.next().charAt(0);
      if (ch == 'V'){
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j);
            }
            
            for (int j= i*2 ; j < 5*2; j++) 
            { 
                System.out.print(" "); 
            } 
            for (int l = i; l >= 1; l--)
            {
                System.out.print(l);
            }
            System.out.println();
        }
        //sc.close();
      
    }
  }
  }