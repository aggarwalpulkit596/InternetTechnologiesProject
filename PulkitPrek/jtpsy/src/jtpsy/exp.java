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
public class exp{
    public static void main(String Args[])
    {
        Scanner sc=new Scanner(System.in);
        String num1,num2;
        System.out.println("Enter two int input");
        num1=sc.next();
        num2=sc.next();
        
        try{
            int a=Integer.parseInt(num1);
            int b=Integer.parseInt(num2);
            }
        catch(NumberFormatException e)
        {
        System.out.println(e);
        }
    }
    
}
