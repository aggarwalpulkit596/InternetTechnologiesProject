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
public class menu {
     public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println(" ENTER YOUR CHOICE \n");
  System.out.println(" 1. FACTORIAL \n");
  System.out.println(" 2. ODDEVEN \n");
  System.out.println(" 3. PRIME NUMBER \n");
  System.out.println(" 4. FIBONACCI SERIES \n");
  System.out.println(" 5. PALINDROME NUMBER \n");
  
  int ch=sc.nextInt();
 
 switch(ch)
 {
  case 1 : 
			  int i,fact=1; 
			 
			  System.out.println("Enter a number");
			  int k=sc.nextInt();	  
				 
			  for(i=1;i<=k;i++){    
				  fact=fact*i;    
			  }    
			  System.out.println("Factorial of "+k+" is: "+fact);    
			  break;
  case 2 :
          
				 System.out.println("Enter a number");
				 int l=sc.nextInt();
				 
				  if(l%2==0)
				   { 
					 System.out.println(" It is even");
				   }
				   else
				   {
					System.out.println(" It is odd ");
				 }	  
				 break;
 case 3 : 
				
				 System.out.println("Enter a number");
				 int m=sc.nextInt();
				 
				 for(i=2;i<m/2;i++)
				 {
				  if(m%i==0)
				   { 
					 System.out.println(" It is not prime");
					 break;
				   }
				   else
				   {
					System.out.println(" It is prime ");
				 }
				 }
                 break;
case 4:  
      int a=0,b=1,sum;
	    System.out.println("Enter limit \n");
	    int n = sc.nextInt();
        System.out.print("First " + n + " terms: ");

        for (i=1;i<=(n-2);i++)
        {
            System.out.print(a+"+");

            sum=a+b;
            a=b;
            b=sum;
        }
		break;
			
case 5:
    System.out.println("Enter a string");
    String s;
    s=sc.next();
    String j="";
    
    for(i=s.length()-1;i>=0;i--)
    {
        j=j+s.charAt(i);        
    }
    System.out.println(j);
    if(s.equals(j))
    {
        System.out.println("It is palindrome");
    }
    else
    {
          System.out.println("It is not palindrome");
    }
    break;
				 
    
default : System.out.println("WRONG CHOICE");
}
}
}