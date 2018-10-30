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
public class digit {
    public static void main(String args[])
    {
         System.out.println("Enter a number ");
         Scanner sc=new Scanner(System.in);
         int sum=0,a,b,mul=1,c,rev=0,g,f,j;
         int x=sc.nextInt();
         g=x;
         f=x;
         j=x;
         while(g>0)
         {
             a=g%10;
             sum+=a;
             g=g/10;
         }
          while(f>0)
         {
             b=f%10;
            mul*=b;
             f=f/10;
         }
            while(j>0)
         {
             c=j%10;
            rev=(rev*10)+c;
             j=j/10;
         }
         System.out.println("Sum of digit of integer is :" +sum );
         System.out.println("Product of digit of integer is :" +mul );
         System.out.println("reverse of digit of integer is :" +rev );
    }
}
    

