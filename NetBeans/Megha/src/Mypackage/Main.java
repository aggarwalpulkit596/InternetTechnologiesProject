/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mypackage;
import java.util.Scanner;
/**
 *
 * @author KMV
 */
public class Main {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of Rectangle:");
        int l = sc.nextInt();
        System.out.println("enter the Breadth of Rectangle:");
        int b = sc.nextInt();
        System.out.println("enter the base of Triangle:");
        int B = sc.nextInt();
        System.out.println("enter the height of Triangle:");
        int h = sc.nextInt();
       
        Area a=new Area();
        a.area1(l,b);
        a.area2(B,h);
              
        
    }
}
