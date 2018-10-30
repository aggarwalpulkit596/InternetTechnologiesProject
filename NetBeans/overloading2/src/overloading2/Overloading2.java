package overloading2;
import java.util.*;
public class Overloading2 {

    void area(double r)
    {
        double cir=3.14*r*r;
        System.out.println("The area of circle is="+cir);
    }
    void area(int l,int b)
    {
        int rec=l*b;
        System.out.println("The area of rectangle is="+rec);
    }
    void area(double r,double h)
    {
        double cyl=2*((3.14*r*h)+(3.14*r*r));
        System.out.println("Area of cylinder is="+cyl);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Overloading2 ob=new Overloading2();
        System.out.println("Enter the Radius of a Circle");
        double redc=sc.nextDouble();
        ob.area(redc);
        System.out.println("Enter the Length and Breadth of a Rectangle");
        int len=sc.nextInt();
        int bre=sc.nextInt();
        ob.area(len,bre);
        System.out.println("Enter the Radius and Height of a Cylinder");
        double redcy=sc.nextDouble();
        double hei=sc.nextDouble();
        ob.area(redcy,hei);
    }
}

    
    

