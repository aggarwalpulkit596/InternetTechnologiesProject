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

public class armarray {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
    System.out.println("Enter 10 numbers");
    int a[]=new int[10];
    int i;
    for(i=0;i<10;i++)
    {
        
    a[i]=sc.nextInt();
    }
    for(i=0;i<10;i++)
    {
    int c,x,rev=0,p,z;
    
    x=a[i];
    p=String.valueOf(x).length();
    
      while(a[i]>0)
         {
             c=a[i]%10;
            rev = (int) (rev + (Math.pow(c,p)));
             a[i]=a[i]/10;
         }
      if(rev==x)
      {
          System.out.println("It is Armstrong number :" + x);
      }
      else
      {
          System.out.println("It is not Armstrong number :" +x);
      }
      }
         
}
}
