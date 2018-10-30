package stackeg;

import java.util.ArrayList;
import java.util.Scanner;

abstract class stack1{
    abstract public void push(int n);
    abstract public int pop();
    abstract public void display();
}

class staticstack extends stack1{
    int size=0;
    int[] arr=null;
    int top;
    Scanner scan=new Scanner(System.in);
    public staticstack()
    {
        System.out.println("enter the size of static stack: ");
        size=scan.nextInt();
        arr=new int[size];
        top=-1;
    }
    public void push(int n)
    {
        if(top==size-1)
            System.out.println("stack overflow");
        else
        {
            top++;
            arr[top]=n;
            System.out.println("element added");
        }
    }
    public int pop()
    {
        int ele=0;
        if(top==-1)
            System.out.println("stack underflow");
        else
        {
             ele=arr[top];
            top--;
           
        }
         return ele;
    }
    
    public void display()
    {
        if(top==-1)
        {
            System.out.println("stack underflow");
        }
        else
        {
            for(int i=top;i>=0;i--)
            {
                System.out.println(arr[i]);
            }
        }
    }
}

 class dynamicstack extends stack1{
    ArrayList<Integer> arr= new ArrayList<Integer>();
    
    public void push(int n)
    {
        arr.add(n);
        System.out.println("element added");
    }
    
    public int pop()
    {
        int v=arr.get(arr.size()-1);
        arr.remove(arr.size()-1);
        return(v);
    }
   
    public void display()
    {
        int s=arr.size();
        for(int i=s-1;i>=0;i--)
        {
            System.out.println(arr.get(i));
        }
    }
}
public class Stackeg {

    public static void main(String[] args) {
        
        int ch1,ch2;
        stack1 st = null;
        staticstack s1=new staticstack();
        dynamicstack s2=new dynamicstack();
        Scanner scan =new Scanner(System.in);
        do{
        System.out.println("***********main***************");
        System.out.println("1. static stack");
        System.out.println("2. dynamic stack");
        System.out.println("enter the choice:");
        int c1=scan.nextInt();
        if(c1==1){
            
            st=s1;
        }
        if(c1==2){
            
            st=s2;
        }
        do{
        System.out.println("choose from menu");
        System.out.println("1.push");
        System.out.println("2.pop");
        System.out.println("3.display");
        System.out.println("enter the choice:");
        int c2=scan.nextInt();
        switch(c2){
            case 1:
                int s;
                System.out.println("how many elements do you want to enter in one go:");
                s=scan.nextInt();
                for(int i=0;i<s;i++)
                {
                System.out.println("enter the element");
                int n=scan.nextInt();
                st.push(n);
                }
                break;
            case 2:
                int m;
                m=st.pop();
                System.out.println("deleted element is "+m);
                break;
            case 3:
                System.out.println("the stack is ");
                st.display();
                break;
        }
            System.out.println("do you want to continue with current stack(1/0)");
            ch2=scan.nextInt();
        }while(ch2==1);
            System.out.println("do you want to continu with other stack(1/0)");
            ch1=scan.nextInt();
    }while(ch1==1);
                }
}
