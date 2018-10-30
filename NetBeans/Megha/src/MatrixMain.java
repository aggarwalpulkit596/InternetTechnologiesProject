/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KMV
 */
import java.util.Scanner;
class matrix{
    
    int r1,c1,r2,c2,i,j,k;
    Scanner sc=new Scanner(System.in); 
    void add(){
        System.out.println("Enter the Number of Rows of 1st Matrix: ");
        r1=sc.nextInt();
        System.out.println("Enter the Number of Columns of 1st Matrix: ");
        c1=sc.nextInt();
        System.out.println("Enter the Number of Rows of 2nd Matrix: ");
        r2=sc.nextInt();
        System.out.println("Enter the Number of Columns of 2nd Matrix: ");
        c2=sc.nextInt();
        int [][]mat1=new int[r1][c1],mat2=new int[r2][c2];
        if((r1==r2) && (c1==c2))
        {
             System.out.println("Enter values for 1st Matrix: ");
        for(i=0 ; i<r1 ; ++i){
            System.out.println("Enter in " +i+ "th Row: ");
            for(j=0 ; j<c1 ; ++j){
                System.out.println("Enter in "+j+"th Column: ");
                mat1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter values for 2nd Matrix: ");
        for(i=0 ; i<r2 ; ++i){
            System.out.println("Enter in " +i+ "th Row: ");
            for(j=0 ; j<c2 ; ++j){
                System.out.println("Enter in "+j+"th Column: ");
                mat2[i][j]=sc.nextInt();
            }
        }
        int sum[][]=new int [r1][c1];
        for(i=0 ; i<r1 ; ++i)
            for(j=0 ; j<c1 ; ++j)
                sum[i][j]=mat1[i][j]+mat2[i][j];
        System.out.println("The Sum of Matrices is: ");
        for(i=0 ; i<r1 ; ++i){
             for(j=0 ; j<c1 ; ++j)
                System.out.print(sum[i][j] + "\t");
             System.out.println();
        }
           
        }
        else
        System.out.println("Matrix not Compatible.");
        }
    void mul(){
        System.out.println("Enter the Number of Rows of 1st Matrix: ");
        r1=sc.nextInt();
        System.out.println("Enter the Number of Columns of 1st Matrix: ");
        c1=sc.nextInt();
        System.out.println("Enter the Number of Rows of 2nd Matrix: ");
        r2=sc.nextInt();
        System.out.println("Enter the Number of Columns of 2nd Matrix: ");
        c2=sc.nextInt();
        if(c1==r2)
        {
            int [][]mat1=new int[r1][c1],mat2=new int[r2][c2]; 
            System.out.println("Enter values for 1st Matrix: ");
        for(i=0 ; i<r1 ; ++i){
            System.out.println("Enter in " +i+ "th Row: ");
            for(j=0 ; j<c1 ; ++j){
                System.out.println("Enter in "+j+"th Column: ");
                mat1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter values for 2nd Matrix: ");
        for(i=0 ; i<r2 ; ++i){
            System.out.println("Enter in " +i+ "th Row: ");
            for(j=0 ; j<c2 ; ++j){
                System.out.println("Enter in "+j+"th Column: ");
                mat2[i][j]=sc.nextInt();
            }
        }
        int prod[][]=new int [r1][c1];
        for(i=0 ; i<r1 ; ++i)
            for(j=0 ; j<c2 ; ++j)
            {   prod[i][j]=0;
                for(k=0 ; k<c1 ; ++k)
                prod[i][j]+=mat1[i][k]*mat2[k][j];
            }
        System.out.println("The Product of Matrices is: ");
        for(i=0 ; i<r1; ++i){
            for(j=0 ; j<c2 ; ++j)
                System.out.print(prod[i][j]+"\t");
            System.out.println();
        }
        }
        else
            System.out.println("Matrices not Compatible for Multiplication.");
}
    void trans(){
        System.out.println("Enter the Number of Rows of Matrix: ");
        r1=sc.nextInt();
        System.out.println("Enter the Number of Columns of Matrix: ");
        c1=sc.nextInt();
        int [][]mat1=new int[r1][c1];
            System.out.println("Enter values for Matrix: ");
        for(i=0 ; i<r1 ; ++i){
            System.out.println("Enter in " +i+ "th Row: ");
            for(j=0 ; j<c1 ; ++j){
                System.out.println("Enter in "+j+"th Column: ");
                mat1[i][j]=sc.nextInt();
            }
    }
        System.out.println("The Transpose of Matrix is: ");
        for(i=0 ; i<c1 ; ++i){
            for(j=0 ; j<r1 ; ++j)
                System.out.print(mat1[j][i]+"\t");
            System.out.println();
        }
}
}
//public 
        class MatrixMain {
    public static void main(String args[]){
        matrix m=new matrix();
        Scanner sc=new Scanner(System.in);
        System.out.println("1) Matrix Addition. \n 2) Matrix Multiplication.\n 3) Matrix Transpose");
        System.out.println("Enter Your Choice: ");
        int ch=sc.nextInt();
        if(ch==1)
            m.add();
        else
            if(ch==2)
                m.mul();
             else
                if (ch==3)
                    m.trans();
                 else
                    System.out.println("Wrong Choice.");
    }
        }
