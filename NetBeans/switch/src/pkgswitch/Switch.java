package pkgswitch;
import java.util.Scanner;
public class Switch
{
public static void main(String[] args)
{ 
	int n;
  	Scanner scanner = new Scanner(System.in);
  	int ans=0;
  	while(ans==0)
  	{
    		System.out.println("enter your choice");
    		n=scanner.nextInt();
    		switch(n)
    		{
    			case 1:
      				int a;
      				System.out.println("enter no to check even or odd");
      				a=scanner.nextInt();
      				if(a%2==0)
           				System.out.println(a+"is even");
      				else
        				System.out.println(a+"is odd");
      				break;
    			case 2:
      				int b;
      				System.out.println("enter no to check prime or not");
      				b=scanner.nextInt();
      				boolean flag = false;
      				for(int i = 2; i <= b/2; ++i)
      				{
       					if(b % i == 0)
       					{
        					flag = true;
        					break;
       					}
      				}
      				if(!flag)
       					System.out.println(b+"is a prime  number.");
      				else
      					System.out.println(b+"is not a prime number");
      				break;
    			case 3:
      				int c,fact=1;
      				System.out.println("enter no to find factorial");
      				c=scanner.nextInt();
      				for(int i = 1;i <= c; i++)
      				{ fact=fact*i; }
      				System.out.println("The factorial of"+c+"is="+fact);
      				break;
    			case 4:
      				int d,e=0,f=0,g=1;
      				System.out.print("enter upto which fabonacci series printed");
      				d=scanner.nextInt();
      				System.out.println("Fibonacci series is");
      				for(int i = 1;i <= d;i++)
      				{
       					e=f;
       					f=g;
       					g=e+f;
       					System.out.print(e+" ");
      				}
      				break;
    		}
		System.out.print("\nEnter 0 to continue, 1 to exit.");
		ans=scanner.nextInt();
	}  
}
}
