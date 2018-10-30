
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KMV
 */
public class main_class {
    public static void main(String args[])
    {
        System.out.println("******Menu******");
        System.out.println("1.Static Stack");
        System.out.println("2.Dynamic Stck");
        System.out.println("3.Exit");
        System.out.println("Enter Your choice ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        char ch;
        String str;
        switch(a)
        {
            case 1:
                static_stack st=new static_stack();
                System.out.println("******Menu******");
                System.out.println("1.push");
                System.out.println("2.pop");
                System.out.println("3.Display");
                System.out.println("4.Exit");
                System.out.println("Enter Your choice ");
                int b=sc.nextInt();
                switch(b)
                {
                    case 1:System.out.print("Enter value to push :");
                          int x=sc.nextInt();
                          st.push(x);
                          break;
                    case 2:
                        int z=st.pop();
                        System.out.print("Deleted value :"+z);
                    break;
                    case 3:st.display();
                    break;
                    case 4:System.exit(10);
                    break;
                }
                break;
            case 2:
                dynamic_stack ds=new dynamic_stack();
                do
                {
                System.out.println("******Menu******");
                System.out.println("1.push");
                System.out.println("2.pop");
                System.out.println("3.Display");
                System.out.println("4.Exit");
                System.out.println("Enter Your choice ");
                int c=sc.nextInt();
                switch(c)
                {
                    case 1:System.out.print("Enter value to push :");
                          int x=sc.nextInt();
                          ds.push(x);
                          break;
                    case 2:
                        int z=ds.pop();
                        System.out.print("Deleted value :"+z);
                    break;
                    case 3:ds.display();
                    break;
                    case 4:System.exit(10);
                    break;
                }
                System.out.println("Continue (Y or N)");
                str=sc.next();
                ch=str.charAt(0);
                }while(ch=='y'||ch=='Y');
                break;
            case 3:System.exit(100);
                    break;
        }
        
        
        
        
    }
    
}
