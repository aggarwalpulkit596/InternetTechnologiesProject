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
public class fact {  
     
     public static void main(String args[]){  
      int i,fact=1; 
      Scanner sc=new Scanner(System.in);
      System.out.println("ENTER A NUMBER");
      int k=sc.nextInt();	  
         
      for(i=1;i<=k;i++){    
          fact=fact*i;    
      }    
      System.out.println("Factorial of " +k+ " is: " +fact);    
       
    }  
    
}
