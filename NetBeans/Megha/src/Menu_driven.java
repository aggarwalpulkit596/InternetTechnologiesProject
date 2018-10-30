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
class Menu_driven
{
public static void main (String args[]){
Scanner sc = new Scanner(System.in);
			System.out.println("01. factorial no.");
            System.out.println("02. even or odd no.");
            System.out.println("03. prime no.");
			System.out.println("04. fibonacci series.");
                        System.out.println("05. palindrome.");
char k='y';
while(k=='y'|| k=='Y')
	
	{
				System.out.println("enter the choice: ");
				int ch = sc.nextInt();
                                if(ch==5){
                                    String Str,rev=" ";
                                    
                                    System.out.println("enter the String");
                                     Str  = sc.nextLine();
                                     int length = Str.length();
                                }
                                else{
				System.out.println("enter the no.");
				int a = sc.nextInt();
				switch (ch) {
				case 1:
				int num=1;
				for(int i=a; i>0; --i)
				{
				num=num*i;

				}
				System.out.println("Factorial of a is;"+num);
				break;

				case 2:
				 
					  if ( a % 2 == 0 )
						 System.out.println("You entered an even number.");
					  else
						 System.out.println("You entered an odd number.");
				   
				   break;
				   
				case 3:int flag=0;
					for(int i=2;i<=a/2;i++)
					{
						if(a%i==0){
							flag=1;
						break;
						}
					}
					if(flag==1)
						System.out.println("The Number is not Prime.");
					else
					
						System.out.println("The Number is Prime.");
					
					 break;
                                
				case 4:   int p=0,q=1,r;
                                            for (int i=0; i<a; i++)
                                                {
                                                     if(i==0)
                                                      System.out.println(p);
                                                     else
                                                         if(i==1)
                                                         System.out.println(q);
                                         else{
                                                r=p+q;
                                                System.out.println(r);
                                                     p=q;
                                                     q=r;
                                            }
    }
							break;
                                case 5:
                                    for( int i = length -1; i>=0; i--)
                                        rev = rev + Str charAt(i);
                                        if(Str.equals(rev))
                                            System.out.println("String is palindrome");
                                        else
                                            System.out.println("String is not palindrome");
                                        break;
                                case 6: 
					 default: System.out.println("Invalid Choice.");
							break;
				
                                            
    }
                                }
				
			 
				
        System.out.println("Want to calculate more - y/n");	
			k=sc.next().charAt(0);
        }
			
			
	
	}
}
