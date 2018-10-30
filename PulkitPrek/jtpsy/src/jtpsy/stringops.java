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
public class stringops {
    

     public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println(" ENTER YOUR CHOICE \n");
  System.out.println(" 1. COMPARE TWO STRINGS \n");
  System.out.println(" 2. CONCATENATE TWO STRINGS \n");
  System.out.println(" 3. COMPARE LENGTH OF TWO STRINGS \n");
  
  int ch=sc.nextInt();
 
 switch(ch)
 {
  case 1 : 
                           String a,b;
                           System.out.println("enter two strings");
                           a=sc.next();
                           b=sc.next();
                           
                           if(a.equalsIgnoreCase(b))
                           {
                               System.out.println("Strings are equal");
                           }
                           else if(a.equals(b))
                           {
                               System.out.println("Strings are NOT equal");
                           }
                           else
                           {
                               System.out.println("Not Equal");
                           }
                           
			 break;
  case 2 :                      System.out.println("enter two strings");
                                a=sc.next();
                                b=sc.next();
                                
				System.out.println(a+" "+b);
					  
				 break;
 case 3 : 
				
                              
                                 System.out.println("enter two strings");
                                 a=sc.next();
                                 b=sc.next();
                                 
                                 if(a.length()==b.length())
                                 {
                                     System.out.println("length is equal : " + a.length()+ "");
                                 }
                                 else
                                 {
                                     System.out.println("Length Not equal");
                                 }
                                 break;  
default : System.out.println("WRONG CHOICE");
}
}
}


    

