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
class Armstrong {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num,temp1,temp2,dig=0,x,i;
        double sum=0;
        System.out.println("Enter the Number: ");
        num=sc.nextInt();
        temp1=num;
        temp2=num;
        while(num!=0){
            num=num/10;
            dig++;
        }
        while(temp1!=0){
            x=temp1%10;
            temp1=temp1/10;
            sum=sum+Math.pow(x,dig);
           // System.out.println(sum);
        }
        if(sum==temp2)
            System.out.println("The Number is Armstrong.");
        else
            System.out.println("The Number is Not Armstrong.");
    }
}

