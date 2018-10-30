package sudesh6;
import java.util.*;
public class Sudesh6 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int i,sum=0;
        double avgpr;
        int pri[]=new int[5];
        System.out.println("Enter the Prices");
        for(i=0;i<5;i++)
        {
            pri[i]=sc.nextInt();
            sum+=pri[i];
        }
        avgpr=sum/5;
        System.out.println("Average of prices is="+avgpr);
        for(i=0;i<5;i++)
        {
            if(avgpr<pri[i])
            {
                System.out.print(pri[i]+  "    ");
             
            }
            
        
        
        }
        System.out.print("are the Prices higher than the average Price "+avgpr);
    }
    
}
