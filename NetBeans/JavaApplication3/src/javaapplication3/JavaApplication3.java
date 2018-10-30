import java.util.Scanner;
class exp{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
int num;
num=scan.nextInt();
try{
if(num<10)
{
throw new ArithmeticException;
}
}
catch(ArithmeticException e){
System.out.println("Number is less than 10.");
}
}
}
