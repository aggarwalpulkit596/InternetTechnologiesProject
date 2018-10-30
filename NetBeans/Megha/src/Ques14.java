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
public class Ques14 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String num1,num2;
        int a,b;
        num1=sc.next();
        num2=sc.next();
        try{
             a=Integer.parseInt(num1);
             b=Integer.parseInt(num2);
             //System.out.println(a);
        }
        catch(NumberFormatException e){
            System.out.println(e);
        }
    }
}
