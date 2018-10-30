/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtpsy;

/**
 *
 * @author KMV
 */
import java.util.Scanner;
class Transpose
{
   public static void main(String args[])
   {
      int m, n, c, d;
 
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the number of rows and columns");
      m = sc.nextInt();
      n = sc.nextInt();
 
      int matrix[][] = new int[m][n];
 
      System.out.println("enter the elements ");
 
      for(c=0;c<m;c++)
         for(d=0;d<n;d++)
            matrix[c][d] = sc.nextInt();
 
      int transpose[][] = new int[n][m];
 
      for(c=0;c<m;c++)
         for(d=0;d<n;d++)               
            transpose[d][c] = matrix[c][d];
 
      System.out.println("transpose of the matrix is:");
 
      for(c=0;c<n;c++)
      {
         for(d=0;d<m;d++)
               System.out.print(transpose[c][d]+"\t");
 
         System.out.println();
      }
   }
}
