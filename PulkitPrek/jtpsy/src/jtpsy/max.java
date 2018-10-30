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
public class max {
     public static void main(String args[])
	 {  
      Scanner sc=new Scanner(System.in);
	  int i,fact=1; 
	  System.out.println("Enter limit \n");
	  int n=sc.nextInt();
      	  
	  int a[]=new int[n];
	  
      
      System.out.println("Enter Numbers \n ");
      	  
         
      for(i=0;i<n;i++)
	  {  
			a[i]=sc.nextInt();
            
      }   
		int m=a[0];    	  
	  for(i=0;i<n;i++)
	  {
	  if(m < a[i])
	  {
	    m=a[i];
	  }
	  }
      System.out.println("HIGHEST NUMBER IS : " +m);    
    }  
   }

