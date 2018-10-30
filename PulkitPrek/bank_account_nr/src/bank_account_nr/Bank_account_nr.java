package bank_account_nr;

import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
 class account {

    private double balance;
    private long acc_no;
    String name;
    //String cust_no;

    public account() {
        Random rand=new Random();
        long x=rand.nextInt(1000000)+1;
        System.out.println("the account no :"+x);
        
        Scanner scan = new Scanner(System.in);
//        long x = scan.nextLong();

        System.out.println("enter the name:");
        String n = scan.next();
        this.acc_no = x;
        this.name = n;
        System.out.println("enter the initial balance:");
        int bal = scan.nextInt();
        this.balance = bal;
    }

    public double deposit(double amt) {
        balance += amt;
        if (amt > 50000) {
            tax_deduct();
        }
        return balance;
    }

    public double withdraw(double amt) {
        if (amt > balance) {
            System.out.println("balance is low");
        } else {
            balance -= amt;
        }
        return balance;
    }

    public long get_acc_no() {
        return this.acc_no;
    }

    public double get_balance() {
        return this.balance;
    }

    public void tax_deduct() {
        System.out.println("tax deducted " + (balance * 0.01));
        balance -= (balance * 0.01);
    }

}

public class Bank_account_nr {

    public static void main(String[] args) {

        ArrayList <account> accounts=new ArrayList<account>();
        accounts.add(new account());
        accounts.add(new account());
        accounts.add(new account());
//        account A = new account();
//        account N1 = null;
//        account B = new account();
           Scanner scan = new Scanner(System.in);
         boolean ch;
        do{
            System.out.println("enter your account no:");
            long i=scan.nextLong();
            account N1=null;
            for(account x:accounts)
            {
                if(x.get_acc_no()==i)
                    N1=x;
            }
            do{
        System.out.println("        manage your account:");
        System.out.println("1.Deposit amount");
        System.out.println("2.withdraw amount");
        System.out.println("3.your account no ");
        System.out.println("4.your account balance");

        System.out.println("Enter your choice");
        int k = scan.nextInt();

        switch (k) {
            case 1:
                System.out.println("enter the amount to deposit");
                double amt1 = scan.nextDouble();
                System.out.println(N1.deposit(amt1));
                break;
            case 2:
                System.out.println("enter the amount to withdraw");
                double amt2 = scan.nextDouble();
                System.out.println(N1.withdraw(amt2));
                break;
            case 3:
                System.out.println("Your account no is");
                System.out.println(N1.get_acc_no());
                break;
            case 4:
                System.out.println("Your account balance is");
                System.out.println(N1.get_balance());
                break;
                
        }
        
                System.out.println("do you want to continue");
                ch=scan.nextBoolean();
        }while(ch==true);
            
            System.out.println("do you want to continue with other account");
                ch=scan.nextBoolean();
        }while(ch==true);
    }

}

