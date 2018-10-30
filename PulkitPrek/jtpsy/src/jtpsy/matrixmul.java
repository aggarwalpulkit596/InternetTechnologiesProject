/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtpsy;

import java.util.Scanner;

/**
 *
 * @author KMV
 */
public class matrixmul {
    public static void main(String args[])
   {
      int m, n, i, j,k;
      Scanner sc = new Scanner(System.in);
 
      System.out.println("Enter the number of rows and columns of matrix");
      m = sc.nextInt();
      n  = sc.nextInt();
 
      int first[][] = new int[m][n];
      int second[][] = new int[m][n];
      int mul[][] = new int[m][n];
 
      System.out.println("Enter the elements of first matrix");
 
      for(i=0;i<m;i++)
         for (j=0;j<n;j++)
            first[i][j] = sc.nextInt();
      for(i=0;i<m;i++)
      {
         for (j=0;j<m;j++)
            System.out.print(first[i][j]+"\t");
 
         System.out.println();
      }
 
      System.out.println("Enter the elements of second matrix");
 
      for(i=0;i<m;i++)
         for (j=0;j<n;j++)
            second[i][j] = sc.nextInt();
       for(i=0;i<m;i++)
      {
         for (j=0;j<m;j++)
            System.out.print(second[i][j]+"\t");
 
         System.out.println();
      }
      for(i=0;i<m;i++)
         for (j=0;j<n;j++)
             for (k=0;k<n;k++)
             {
                 mul[i][j]+=first[i][j]*second[k][j];
                // mul[i][j] = (first[i][k]*second[k][j]) + (first[i][k]*second[k][j]) + (first[i][k]*second[k][j]);
             }
                
 
      System.out.println("Mul of entered matrices:-");
 
      for(i=0;i<m;i++)
      {
         for (j=0;j<m;j++)
            System.out.print(mul[i][j]+"\t");
 
         System.out.println();
      }
   }
    
}
