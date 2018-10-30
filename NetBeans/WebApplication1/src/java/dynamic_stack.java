
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KMV
 */
public class dynamic_stack extends abstarct_class{

    ArrayList<Integer> a=new ArrayList<>();

    int top=-1;
    @Override

    void push(int x) 
    {
        a.add(x);        
    }

    @Override
    int pop() {
        if(a.size()==0)
        {
            System.out.println("Stack is empty ");
        }
        else
        {
            int s=a.size();
            int x=a.remove(s);
            
            return x;
        }
        return 0;
        
    }

    void display() {
            
                if(a.size()==0)
                {
                    System.out.println("Stack is empty ");
                }
                else
                {
                    for(int i=a.size();i>=0;i--)
                    {
                        System.out.println("Stack is :"+a.get(i));
                    }
                }
    }
    
   
}
