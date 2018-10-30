package example5;
import java.util.*;
public class example5 {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int[][] A = new int[10][10];
int[][] B = new int[10][10];
int[][] C = new int[10][10];
int m,n,p,q;
System.out.println("Enter number of rows for matrix A : ");
m = input.nextInt();
System.out.println("Enter number of columns for matrix A : ");
n = input.nextInt();
System.out.println("Enter number of rows for matrix B : ");
p = input.nextInt();
System.out.println("Enter number of columns for matrix B : ");
q = input.nextInt();
System.out.println("Enter elements for matrix A : ");
for (int i=0 ; i < m ; i++)
for(int j=0 ; j < n ; j++)
{
A[i][j] = input.nextInt();
}
System.out.println("Enter elements for matrix B : ");
for (int i=0 ; i < p ; i++)
for(int j=0 ; j < q ; j++){
B[i][j] = input.nextInt();
}
System.out.println("Matrix A: ");
for(int i=0 ; i < m ; i++)
{
System.out.println();
for(int j=0 ; j < n ; j++)
{
System.out.print(A[i][j]+" ");
}
}
System.out.println();
System.out.println("Matrix B: ");
for (int i=0 ; i < p ; i++)
{ System.out.println();
for(int j=0 ; j < q ; j++){
System.out.print(B[i][j]+" ");
}
}
System.out.println();
int menu = 0;
System.out.println();
System.out.println("1. Addition Of Matrix");
System.out.println("2. transpose Of Matrix 1");
System.out.println("3. Multiplication Of Matrix");
boolean quit = false;
do{
System.out.print("Please enter your choice: ");
menu = input.nextInt();
System.out.println();
switch(menu) {
case 1:
if (m!=p||n!=q)
{
System.out.println("Sum of 2 matrices is not possible.");
break;
}
System.out.println("Sum of 2 matrices");
for(int i=0;i<m;i++){
for(int j=0;j<n;j++){
C[i][j]=A[i][j]+B[i][j];
System.out.print(C[i][j]+" ");
}
System.out.println();
}
break;
case 2:
if (m!=p||n!=q)
{
System.out.println("Subtraction of 2 matrices is not possible.");
break;
}
System.out.println("transpose of first matrix");
for(int i=0;i<m;i++){
for(int j=0;j<n;j++){
C[i][j]=A[j][i];
System.out.print(C[i][j]+" ");
}
System.out.println();
}
break;
case 3:
if (n!=p)
{
System.out.println("Multiplication of 2 matrices is not possible.");
break;
}
System.out.println("Multiplication of 2 matrices");
for(int i=0;i<m;i++){
for(int j=0;j<q;j++){
C[i][j]=0;
for(int k=0;k<n;k++){
C[i][j]+=A[i][k]*B[k][j];
}
}
}
for(int i=0;i<m;i++){
for(int j=0;j<q;j++){
System.out.print(C[i][j]+" ");
}
System.out.println();
}

default:
System.out.println("Invalid Entry!");
}
}
while(!quit);
}
}    
    

