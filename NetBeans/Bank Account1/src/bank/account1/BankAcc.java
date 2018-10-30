package bank.account1;
import java.util.*;

/**
 *
 * @author GSS
 */
class methods{
    static int acc =10000 ;
    static float bal=0;
    public float Deposit(float x){
        if(x>100000){
            bal+=x;
            System.out.println("Transaction Successful");
            taxDed();
        }
        else{
            bal+=x;
            System.out.println("Transaction Successful");
        }
        return bal;
    }
    public float withdraw(float x){
        if(bal==0){
            System.out.println("You have unsufficient balance, transaction declined!");
        }
        else{
            bal-=x;
        }
        return bal;
    }
    public int getAcc(){
        return acc;
    }
    public float getBal(){
        return bal;
    }
    public void taxDed(){
        float t = (bal*1)/100;
        bal-=t;
    }
    public static void main(String[] args) {
        
    }
}
public class BankAcc {

    
    public static void main(String[] arg){
        methods o = new methods();
        System.out.println("----------------------------");
        System.out.println("**********GSS BANK**********");
        System.out.println("----------------------------");
        System.out.println("1) Deposit");
        System.out.println("2) Withdrawal");
        System.out.println("3) Current Balance");
        System.out.println("Please select an option");
        Scanner sc=new Scanner(System.in);
            int a =sc.nextInt();
         switch(a){
             case 1 :
                 System.out.println("Your current balance is :");
                 System.out.println(o.getBal()); 
                 System.out.println("Input deposit amount :");
                 int b=sc.nextInt();
                 o.Deposit(b);
                 System.out.println("Your current balance is :");
                 System.out.println(o.getBal()); 
                 break;
             case 2:
                System.out.println("Your current balance is :");
                 System.out.println(o.getBal()); 
                 System.out.println("Input withdrawal amount :");
                 int c=sc.nextInt();
                 o.withdraw(c);
                 System.out.println("Your current balance is :");
                 System.out.println(o.getBal());
                  break;
             case 3:
                 System.out.println("Your current balance is :");
                 System.out.println(o.getBal());
                 break;
        }
    
    }
}
