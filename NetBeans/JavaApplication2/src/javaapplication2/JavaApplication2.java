public class Account
{
int accNo=99000;
float bal=0;
String name;
Account(String s,int num,float b)
{
name=s;
bal=b;
accNo=num;
}
float deposit(float x)
{
bal=bal+x;
return bal;
}
float withdraw(float x)
{
if(x>bal)
return -1;
else
{
bal=bal-x;
return bal;
}
}
int getAccno()
{
return accNo;
}
float getBal()
{
return bal;
}
void taxDed()
{
bal=bal-(0.05f*bal);
}
void accDetails()
{
System.out.println("\tName of account holder :"+name);
System.out.println("\tAccount Number :"+accNo);
System.out.println("\tBalance :"+bal);
}
}










//Puneet K paliya
import java.io.*;
import java.util.*;
public class Bank
{
ArrayList<Account> accounts=new ArrayList<Account>();
void addAcc(String n,int a,float b)
{
Account ac=new Account(n,a,b);
accounts.add(ac);
System.out.println("\n\tDetails of your new account are ");
ac.accDetails();
}
void getTBal()
{
float sum=0;
for(Account e: accounts)
{
sum=sum+e.getBal();
}
System.out.println("\tTotal Balance in the bank is: Rs "+sum);
}
void minmax()
{
float min,max;
int mina,maxa;
Account e1=accounts.get(0);
min=max=e1.getBal();
mina=maxa=e1.getAccno();
for(Account e : accounts)
{
if(min>e.getBal())
{
mina=e.getAccno();
min=e.getBal();
}
if(max<e.getBal())
{
maxa=e.getAccno();
max=e.getBal();
}
}System.out.println("\tDetails of account with minimum balance");
int flag=0;
for(Account a: accounts)
{
if(a.getAccno()==mina)
{
a.accDetails();
flag=1;
}
}
System.out.println("\tDetails of account with maximum balance");
flag=0;
for(Account a: accounts)
{
if(a.getAccno()==maxa)
{
a.accDetails();
flag=1;
}
}
}
void count(float m)
{
int count=0;
for(Account a:accounts)
{
if(a.getBal()>=m)
count++;
}
System.out.println("The number of accounts with atleast Rs. "+m+"as
balance are "+count);
}
void bankDetails()
{
for(Account a:accounts)
{
a.accDetails();
}
}
public static void main(String args[])throws IOException
{
int ch,ch1,ch2,accNo=99000;
float bal;
String n;
Bank b=new Bank();
Scanner s=new Scanner(System.in);
int e=0,e1=0,e2=0;
System.out.println("\t\t\t***** Welcome to Paliya Bank *****");
do
{
System.out.println("\t\tChoose from given options");
System.out.println("\tEnter 1: Manage bank accounts");
System.out.println("\tEnter 2: Personal Banking");
System.out.println("\tEnter 3: Exit");
System.out.print("\tEnter here -> ");
ch=s.nextInt();
switch(ch)
{
case 1:
do
{
System.out.println("\t\tChoose from given options");
System.out.println("\t1: Add new account");
System.out.println("\t2: Total balance in the bank");
System.out.println("\t3: Account with max and min balance");
System.out.println("\t4: Number of accounts with balance above specific value");
System.out.println("\t5: Details of all accounts in the bank");
System.out.print("\tEnter here -> ");
ch1=s.nextInt();
switch(ch1)
{
case 1:
System.out.print("\tEnter the name of account holder -> ");
n=s.next();
System.out.print("\tEnter the initial balance -> ");
bal=s.nextFloat();
accNo=accNo+1;
b.addAcc(n,accNo,bal);
break;
case 2:b.getTBal();
break;
case 3:b.minmax();
break;
case 4:System.out.print("\tEnter the minimum specific balance -> ");
bal=s.nextFloat();
b.count(bal);
break;
case 5:
b.bankDetails();
break;
}
System.out.println("\tEnter 1: To continue with managing account");
System.out.println("\tEnter 2: To go to main menu");
System.out.print("\tEnter -> ");
e1=s.nextInt();
}while(e1==1);
break;
case 2:
do
{
System.out.print("\tEnter the account number of account you need to use -> ");
accNo=s.nextInt();
System.out.println("\t\tChoose from given options");
System.out.println("\t1: Deposit");
System.out.println("\t2: Withdraw");
System.out.println("\t3: Account Details");
System.out.print("\tEnter here -> ");
ch2=s.nextInt();
switch(ch2)
{
case 1:
System.out.print("\tEnter the amount of money to be deposited -> ");
bal=s.nextFloat();
int flag=0;
for(Account a: b.accounts)
{
if(a.getAccno()==accNo)
{
float bd=a.deposit(bal);
System.out.println("\tThe amoumt after depositing money is : "+bd);
a.taxDed();
System.out.println("\tThe amoumt after tax deduction is : "+a.getBal());
flag=1;
break;
}
}
if(flag==0)
System.out.println("\tAccount not found");
break;
case 2:System.out.print("\tEnter the amount of money to withdraw -> ");
bal=s.nextFloat();
flag=0;
for(Account a: b.accounts)
{
if(a.getAccno()==accNo)
{
float w=a.withdraw(bal);
if(w==-1)
{
System.out.println("\tYou don't have enough balance");
flag=1;
}
else
{
System.out.println("\tThe amoumt after withdrawing money is : "+w);
a.taxDed();
System.out.println("\tThe amoumt after tax deduction is : "+a.getBal());
flag=1;
break;
}
}
}
if(flag==0)
System.out.println("\tAccount not found");
break;
case 3:
flag=0;
for(Account a: b.accounts)
{
if(a.getAccno()==accNo)
{
a.accDetails();
flag=1;
}
}
if(flag==0)
System.out.println("\tAccount not found");
break;
}
System.out.println("\tEnter 1: To continue with personal banking");
System.out.println("\tEnter 2: To go to main menu");
System.out.print("\tEnter -> ");
e2=s.nextInt();
}while(e2==1);
break;
case 3: System.out.println("\t\t\tThanks for using Paliya bank...
Visit again...");
e=1;
break;
}
}while(e!=1);
}
}