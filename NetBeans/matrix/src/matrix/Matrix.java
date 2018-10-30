package matrix;
import java.util.*;
public class Matrix {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int ch,M,N,i,j;
        System.out.println("1.For Addition of 2 Matrix");
        System.out.println("2.For Subtraction of 2 Matrix");
        System.out.println("3.For Transpose of a Matrix ");
        System.out.println("Enter your choice");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:System.out.println("Enter the row and column of a Matrix");
            M=sc.nextInt();
            N=sc.nextInt();
            int A[][]=new int[M][N];
            int B[][]=new int[M][N];
            int C[][]=new int[M][N];
            System.out.println("Enter the 1st Matrix elements");
            for(i=0;i<M;i++)
            {
                for(j=0;j<N;j++)
                {
                    A[i][j]=sc.nextInt();
                }
            }
            System.out.println("Enter the 2nd Matrix elements");
            for(i=0;i<M;i++)
            {
                for(j=0;j<N;j++)
                {
                    B[i][j]=sc.nextInt();
                }
            }
            System.out.println("The addition of Matrix is");
            for(i=0;i<M;i++)
            {
                for(j=0;j<N;j++)
                {
                    C[i][j]=A[i][j]+B[i][j];
                    System.out.print(C[i][j]+" ");
                }
                System.out.println();
            }
            break;
            case 2:System.out.println("Enter the row and column of a Matrix");
            M=sc.nextInt();
            N=sc.nextInt();
            int X[][]=new int[M][N];
            int Y[][]=new int[M][N];
            int Z[][]=new int[M][N];
            System.out.println("Enter the 1st Matrix elements");
            for(i=0;i<M;i++)
            {
                for(j=0;j<N;j++)
                {
                    X[i][j]=sc.nextInt();
                }
            }
            System.out.println("Enter the 2nd Matrix elements");
            for(i=0;i<M;i++)
            {
                for(j=0;j<N;j++)
                {
                    Y[i][j]=sc.nextInt();
                }
            }
            System.out.println("The subtraction of Matrix is");
            for(i=0;i<M;i++)
            {
                for(j=0;j<N;j++)
                {
                    Z[i][j]=X[i][j]-Y[i][j];
                    System.out.print(Z[i][j]+" ");
                }
                System.out.println();
            }
            break;
            case 3:System.out.println("Enter the row and column of a Matrix");
            M=sc.nextInt();
            N=sc.nextInt();
            int T[][]=new int[M][N];
            int T1[][]=new int[N][M];
            System.out.println("Enter the Matrix elements");
            for(i=0;i<M;i++)
            {
                for(j=0;j<N;j++)
                {
                    T[i][j]=sc.nextInt();
                }
            }
            System.out.println("The Original Matrix is");
            for(i=0;i<M;i++)
            {
                for(j=0;j<N;j++)
                {
                    System.out.print(T[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("The Transpose of Matrix is");
            for(i=0;i<N;i++)
            {
                for(j=0;j<M;j++)
                {
                    T1[i][j]=T[j][i];
                    System.out.print(T1[i][j]+" ");
                }
                System.out.println();
            }
        }
            
    }
    
}

