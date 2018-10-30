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
public class price {
     public static void main(String args[])
	 {  
      Scanner sc=new Scanner(System.in);
	  int i; 
	  
	  long a[]=new long[15];
	  
      
      System.out.println("Enter 5 Prices \n");
      	  
         
      for(i=0;i<5;i++)
	  {  
			a[i]=sc.nextInt();
            
      }   
		long m=a[0];
		float sum=0;
		float avg;
	  for(i=0;i<5;i++)
	  {
		sum=sum+a[i];
	  }
	    avg=(sum/5);
		System.out.println("\n Average is  " +avg +"\n");
		System.out.println("Prices greater than average is/are \n");
	    for(i=0;i<5;i++)
	  {
		if(a[i]>avg)
		{
      System.out.println(a[i]);  
		}
    }  
   }
   }
