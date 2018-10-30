package javaapplication35;
import java.util.Scanner;
public class JavaApplication35 {
public static void main(String[] args) {
int n;
System.out.println("Enter 1 for compare two string");
System.out.println("Enter 2 for concatenate two string");
System.out.println("Enter 3 to find length of string");
Scanner scanner = new Scanner(System.in);
  	int ans=0;
  	while(ans==0)
        {System.out.println("enter your choice");
    		n=scanner.nextInt();
    		switch(n)
    		{
    			case 1:
      				String s1, s2;
                                Scanner in = new Scanner(System.in);
     
                                 System.out.println("Enter the first string");
                                s1 = in.nextLine();
     
                                System.out.println("Enter the second string");
                                s2 = in.nextLine();

                                if (s1.compareTo(s2) > 0)
                                   System.out.println("The first string is greater than the second.");
                                else if (s1.compareTo(s2) < 0)
                                   System.out.println("The first string is smaller than the second.");
                                else  
                                   System.out.println("Both the strings are equal.");
                                break;
    			case 2:
      				String str1, str2;
                                Scanner scan = new Scanner(System.in);

                                System.out.print("Enter First String : ");
                                str1 = scan.nextLine();
                                System.out.print("Enter Second String : ");
                                str2 = scan.nextLine();

                                System.out.print("Concatenating String 2 into String 1...\n");
                                str1 = str1.concat(str2);

                                System.out.print("String 1 after Concatenation is " +str1);
      				break;
                        case 3:
      				String str;
                                int len;
                                Scanner scane = new Scanner(System.in);
                                System.out.print("Enter the string : ");
                                str = scane.nextLine();
                                len = str.length();

                                System.out.print("Length of Entered String is " + len);
                                break;
                                }
		System.out.print("\nEnter 0 to continue, 1 to exit.");
		ans=scanner.nextInt();
    }
    
}
}
