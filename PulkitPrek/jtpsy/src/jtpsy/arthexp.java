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
public class arthexp {
    public static void main(String Args[])
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers ");
        a=sc.nextInt();
        b=sc.nextInt();
        
        try{
         int c=a/b;
         System.out.println(" c is " +c);
         
        // throw new ArithmeticException(" / by zero");
         
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}      