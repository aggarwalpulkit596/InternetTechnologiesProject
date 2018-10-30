/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.account1;
import static bank.account1.methods.acc;
import java.util.ArrayList;
/**
 *
 * @author KMV
 */
public class Bank {
    
    public static void main(String args[])
    {
        ArrayList<BankAc> account=new ArrayList<BankAc>();
        account.add(new BankAc(100));
        account.add(new BankAc(1032));
        account.add(new BankAc(1012));
        account.add(1,new BankAc(1200));
        account.remove(0);
        
        System.out.println("size :"+ account.size());
        BankAc a=account.get(0);
        System.out.println("first ac :"+ a.getAcc());
    }
    
    
}

class BankAc
{
    int acc;
    float bal;
    public BankAc(int acno)
    {
        acc=acno;
        bal=0;
    }
    public BankAc(int acno,float bl)
    {
        acc=acno;
        bal=bl;
    }
    public int getAcc(){
        return acc;
    }
    public float getBal(){
        return bal;
    }
}


