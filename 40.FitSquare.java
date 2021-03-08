/*PrepBuddy provided you with a rectangular board of MxN
 dimension. Also, he provided an unlimited number of small blocks of 2x1 size. You are allowed to rotate the block. You are asked to place as many blocks as possible on the board to meet the following conditions:
1. Each block completely covers two squares.
2. No two blocks overlap.
3. Each block lies entirely inside the board. It is allowed to touch the edges of the board.
Find the maximum number of blocks, which can be placed under these restrictions.
*/

import java.util.*;
import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      Scanner sc = new Scanner(System.in);
      int m, n, ans,t;
      t= sc.nextInt();
      for(int i=0; i<t; i++){
      n= sc.nextInt();
      m= sc.nextInt();
      ans= (n*m)/2;
      System.out.println(ans);
      }
    }
  }