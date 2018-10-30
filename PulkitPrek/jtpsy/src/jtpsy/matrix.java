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
public class matrix
{
   public static void main(String args[])
   {
      int m, n, i, j;
      Scanner sc = new Scanner(System.in);
 
      System.out.println("Enter the number of rows and columns of matrix");
      m = sc.nextInt();
      n  = sc.nextInt();
 
      int first[][] = new int[m][n];
      int second[][] = new int[m][n];
      int sum[][] = new int[m][n];
 
      System.out.println("Enter the elements of first matrix");
 
      for(i=0;i<m;i++)
         for (j=0;j<m;j++)
            first[i][j] = sc.nextInt();
 
      System.out.println("Enter the elements of second matrix");
 
      for(i=0;i<m;i++)
         for (j=0;j<m;j++)
            second[i][j] = sc.nextInt();
 
      for(i=0;i<m;i++)
         for (j=0;j<m;j++)
             sum[i][j] = first[i][j] + second[i][j];  
 
      System.out.println("Sum of entered matrices:-");
 
      for(i=0;i<m;i++)
      {
         for (j=0;j<m;j++)
            System.out.print(sum[i][j]+"\t");
 
         System.out.println();
      }
   }
}