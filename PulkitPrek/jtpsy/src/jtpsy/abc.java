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
public class abc {
    int x=123;
    abc(int y)
    {
        System.out.println(s);
        s=200;
        x=y;
    }
    static int s=10;
    static{
        System.out.println("instatic");
        s=100;
    }    public static void main(String args[])

    {
        abc a=new abc(34);
        System.out.println(a.s+""+a.x);
        abc b=new abc(45);
        System.out.println(b.s+""+b.x);
        
         
    }
}
