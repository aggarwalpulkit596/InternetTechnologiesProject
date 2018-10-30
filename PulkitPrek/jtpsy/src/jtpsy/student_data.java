/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtpsy;

import java.io.*;
import java.util.Scanner;
public class student_data {

public static void main (String args[]) throws IOException
        
{
    String stud ="C:\\Users\\KMV\\Documents\\NetBeansProjects\\jtpsy\\src\\jtpsy\\stud.txt";
    Scanner sc=new Scanner(System.in);
    FileOutputStream fout=new FileOutputStream(stud);
    int i;
    int n ;
    System.out.println("enter no of studs");
    n=sc.nextInt();
    int roll;
    int m1,m2,m3;
    String name;
    for(i=0;i<n;i++)
    {    
        
        System.out.println("enter name");
        name=sc.next();
        
        System.out.println("enter roll no.");
        roll=sc.nextInt();
        
        System.out.println("enter marks in three subjects");
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();
        byte b[]=name.getBytes();
        fout.write(b);
        fout.write(roll);
        fout.write(m1);
        fout.write(m2);
        fout.write(m3);  
        
    }
    
    
}
}
