/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KMV
 */
public class static_stack extends abstarct_class{
    int max=10;
    int arr[]=new int[max];
    int top=-1;
    
    void push(int x)
    {
        if(top==max)
        {
            System.out.println("Stack is full ");
        }
        else
        {
            top++;
            arr[top]=x;
        }
    }
    
    int pop()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty ");
        }
        else
        {
            int x=arr[top];
            top--;
            return x;
        }
        return 0;       
    }
    
    void display()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty ");
        }
        else
        {
            for(int i=top;i>=0;i--)
            {
                System.out.println("Stack is :"+arr[i]);
            }
        }
        
    }
}
