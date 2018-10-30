/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KMV
 */
import java.util.Scanner;
public class Fraction {
 int x,y;
 Fraction(){
     x=y=1;
 }
 Fraction(int a , int b){
     x=a;
     y=b;
 }
 void ratio(){
     try{
         double z=x/y;
         //double z=(double) x/(double) y;
         System.out.println("The Ratio of both Numbers is: "+z);
         //throw new ArithmeticException("Denominator is 0");
     }
    catch(ArithmeticException e){
         System.out.println(e);
     }
 }
}

class main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x,y;
        //Fraction f1=new Fraction();
        //f1.ratio();
        System.out.println("Enter 1st Number:");
        x=sc.nextInt();
        System.out.println("Enter 2nd Number:");
        y=sc.nextInt();
        
        Fraction f2= new Fraction(x,y);
        f2.ratio();
    }
}
