package bank_account_nr;
import java.util.ArrayList;
import java.util.Scanner;

  class account2
 {
      ArrayList<account> arr=new ArrayList<account>();
//     private double balance;
//    private long acc_no;
    
    public void addaccounts(){
        arr.add(new account());
      
    }
    public double gettotalbalance()
    {
        double total=0;
        for(account x:arr )
        {
            total+=x.get_balance();
        }
        return(total);
    }
    
    public void max_min(){
        double max_bal=0;
        long max_acc=0;
        double min_bal=200000000;
        long min_acc=0;
        
        for(account x:arr )
        {
            double bal=x.get_balance();
            if(bal>max_bal)
            {
                max_bal=bal;
                max_acc=x.get_acc_no();
            }
            if(bal<min_bal)
            {
                min_bal=bal;
                min_acc=x.get_acc_no();
            }    
        }
        
        System.out.print("account with max balance:"+max_bal);
        
        System.out.print("account with min balance:"+min_bal);
    }
    
    public void find_acc(long acc_num){
        for(account x:arr){
            if(x.get_acc_no()==acc_num){
                System.out.println("account number:"+acc_num+" balance:"+x.get_balance());
                return;
            }
        }
    }
    
    public void match_bal(double bal){
        int count=0;
        for(account x:arr){
            if(x.get_balance()>=bal)
                count++;
        }
        System.out.println("total no of accounts with balance "+bal+" are "+count);
    }
 }
public class bank2 {
        public static void main(String[] args) {
            
            account2 a=new account2();
            int ch;
            Scanner scan =new Scanner(System.in);
            do
            {
                System.out.println("********accounts**********");
                System.out.println("1.add account to bank");
                System.out.println("2.total balance of bank");
                System.out.println("3.accounts with maximum and minimum balance");
                System.out.println("4.find account details");
                System.out.println("5.no of accounts with a particular account");
                System.out.println("enter your choice");
                int c=scan.nextInt();
                    switch(c)
                    {
                        case 1:
                            a.addaccounts();
                            break;
                        case 2:
                           double bal= a.gettotalbalance();
                            System.out.println("Total balance is "+ bal);
                            break;
                        case 3:
                            a.max_min();
                            break;
                        case 4:
                            System.out.println("enter the account no");
                            int n=scan.nextInt();
                            a.find_acc(n);
                            break;
                        case 5:
                           System.out.println("enter the amount");
                            int s=scan.nextInt();
                            a.match_bal(s);
                            break;
                    }
                    System.out.println("dou you want to continue(0/1)");
                    ch=scan.nextInt();
            }while(ch==1);
    }
}
