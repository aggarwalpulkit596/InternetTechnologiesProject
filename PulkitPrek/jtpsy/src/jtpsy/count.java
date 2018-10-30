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
public class count {
       public static void main(String args[])
	 {  
      Scanner sc=new Scanner(System.in);
	  int i; 
	  
	  int a[]=new int[15];
	  
      
      System.out.println("Enter 10 Numbers \n");
      	  
         
      for(i=0;i<10;i++)
	  {  
			a[i]=sc.nextInt();
            
      }   
	  System.out.println("Enter no to check \n ");
	  int k=sc.nextInt();
	  int gt=0,lt=0,eq=0;
	  for(i=0;i<10;i++)
	  {
		if(k==a[i])
		{
		eq++;
		}
		if(k>a[i])
		{
		lt++;
		}
		if(k<a[i])
		{
		gt++;
		}
		
	  }
	 
	   
        System.out.println( "\nNo Less than " +k+ " are : " +lt);  
		System.out.println( "No greater than " +k+ " are : " +gt);
		System.out.println( "No equal to " +k+ " are : " +eq);
    }  
   }
    
