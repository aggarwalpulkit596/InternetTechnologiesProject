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
 class StringOperations {
public static void main (String args[]){
    Scanner sc = new Scanner (System.in);
        int ch;
            
char k='y';
while(k=='y'|| k=='Y'){
		System.out.println("01. comparison of string.");
            System.out.println("02.concatenation of strings.");
            System.out.println("03. length of string.");
                System.out.println("enter the first string: ");
                String ch1 = sc.next();
                String ch2;
                System.out.println("enter the second string: ");
                ch2 =sc.next();
        System.out.println("Enter the Choice: ");
        ch=sc.nextInt();
        switch (ch) {
            case 1:
       
if (ch1.equals(ch2))
System.out.println("strings are equal.");
      else
System.out.println("strings are not equal.");
break;
            case 2:
                System.out.println("Concatenating String ch1 into String ch2...\n" + ch2 + ch1);
      break;
            case 3:
                System.out.println("Length of First String is: " + ch1.length());
       System.out.println("Length of Second String is: " + ch2.length());
break;
       case 4: 
	default: System.out.println("Invalid Choice.");
	break;
				
}
        
       System.out.println("Want to calculate more - y/n");	
k=sc.next().charAt(0);
        }
 }
 }