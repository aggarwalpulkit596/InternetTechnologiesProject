/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KMV
 */
import java.io.*;
import java.util.Scanner;

public class FileHandling {
    public static void main(String args[]) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        String file= "C:\\Users\\KMV\\Desktop\\Varun-PSCS-V\\Student";
        System.out.println("Enter the number of Students: ");
        int num = sc.nextInt();
        FileOutputStream fout = new FileOutputStream(file);
        writedata(file,num);
        average(file,num);
        fout.close();
    }
static void writedata(String name, int num) throws IOException
{
    BufferedReader ob1 = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter ob2 = new BufferedWriter(new FileWriter(name));
    for (int i=0 ; i<num ; ++i){
        System.out.println("Enter data for Student "+(i+1) +" :");
        System.out.println("Enter the Name: ");
        ob2.write(ob1.readLine()+"\t");
        System.out.println("Enter Roll No.: ");
        ob2.write(ob1.readLine()+"\t");  
        System.out.println("Enter Marks1: ");
        ob2.write(ob1.readLine()+"\t");
        System.out.println("Enter Marks2: ");
        ob2.write(ob1.readLine()+"\t");
        System.out.println("Enter Marks3: ");
        ob2.write(ob1.readLine()+"\t");
        ob2.write("\n");
    }
    ob2.close();
}

static void average(String name, int num) throws IOException
{
BufferedReader ob = new BufferedReader(new FileReader(name));
float m1,m2,m3,avg;
int rollno,i;
System.out.println("Roll No  Average");
for (i=0 ; i<num ; ++i){
String str = ob.readLine();
String arr[] = str.split("\t");
rollno = Integer.parseInt(arr[1]);
m1 = Integer.parseInt(arr[2]);
m2 = Integer.parseInt(arr[3]);
m3 = Integer.parseInt(arr[4]);
avg = (m1+m2+m3)/3;
System.out.println(rollno +"\t"+ avg);
}
}
}
