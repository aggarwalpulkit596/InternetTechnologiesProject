/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KMV
 */
import java.util.*;
public class IntString {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int sum=0, prod=1,count=0,i;
        double rev=0;
        System.out.println("Enter the Number: ");
        int num=sc.nextInt();
        int n=num;
        while(num!=0)
        {
            sum=sum+num%10;
            prod=prod*(num%10);
            num/=10;
            ++count;
        }
        for(i=count-1;i>=0; --i){
            rev=rev+(n%10)*Math.pow(10,i);
            n/=10;
        }
        System.out.println("The Sum of Digits is: "+sum+"\n The Product of Digits is: "+prod);
        System.out.println("The Reverse of String is: "+rev);
    }
}
