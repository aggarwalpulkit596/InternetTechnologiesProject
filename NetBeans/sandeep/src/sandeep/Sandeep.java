package sandeep;
import java.util.*;
public class Sandeep {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i,eqn=0,ln=0,gn=0;
        int a[]=new int[10];
        System.out.println("Enter the array elements");
        for(i=0;i<10;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the No.");
        n=sc.nextInt();
        for(i=0;i<10;i++)
        {
            if(n==a[i])
                eqn++;
            else if(n<a[i])
                gn++;
            else
                ln++;            
        }
            System.out.println("No.s in array equal to "+n+" is="+eqn);
            System.out.println("No.s in array less than "+n+" is="+ln);
            System.out.println("No.s in array greater than "+n+" is="+gn);
    }
}



