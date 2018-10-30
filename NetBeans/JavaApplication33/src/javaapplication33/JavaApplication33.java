package javaapplication33;
import java.util.Scanner;
public class JavaApplication33
{
    static void Fun(String num1,String num2)
    {
        try
        {
        int a=Integer.parseInt(num1);
        int b=Integer.parseInt(num2);
        System.out.println("The number are converted to integersuccessfully.");
        }
        catch(NumberFormatException ex)
        {
            ex.getMessage();
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("the two number is in string format:");
        String num1=sc.next();
        String num2=sc.next();
        Fun(num1,num2);
    }
}
