package question7;
import java.util.*;
public class question7 {
 public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n,i,carm=0;
        System.out.println("Enter the length of Array");
        n=sc.nextInt();
        int arm[]=new int[n];
        System.out.println("Enter the array elements");
        for(i=0;i<n;i++)
        {
            arm[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            int j,a,r,pw,c=0,sum=0;
            a=arm[i];
            while(a>0)
            {
                c++;
                a/=10;
            }
            a=arm[i];
            while(a>0)
            {
                r=a%10;
                pw=1;
                for(j=1;j<c+1;j++)
                {pw*=r;}
                sum+=pw;
                a/=10;
            }
            if(sum==arm[i])
            {
                System.out.print(arm[i]+"  ");
                carm++;
            }
        }
        if(carm>0)
            System.out.println("are the Armstrong numbers in an Array");
        else
            System.out.println("There is no Armstrong number in an Array");
    }
    
}
