/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtpsy;

/**
 *
 * @author KMV
 */
public abstract class figure {
    double dim1,dim2;
    
    figure(double x,double y)
    {
        dim1=x;
        dim2=y;
    }
    abstract double area();
}
class triangle extends figure
{
    triangle(double x,double y)
    {
    super(x,y);
    
    }
    double area()
    {
        double a;
        a=(dim1*dim2)/2;
        System.out.println(a);
        return a;
    }
}
class rectangle extends figure
{
    rectangle(double x,double y)
    {
        super(x,y);
        
    }
    double area()
    {
        double a;
        a=(dim1*dim2);
        System.out.println(a);
        return a;
        
    }
}

class circle extends figure
{
    circle(double x,double y)
    {
        super(x,y);
        
    }
    double area()
    {
        double a;
        a=(dim1*dim1)*(3.14);
        System.out.println(a);
        return a;
    }
}
class cylinder extends figure
{
    cylinder(double x, double y)
    {
        super(x,y);
    }
    double area()
    {
        double a;
        a=2*(dim1*dim2)*(3.14);
        System.out.println(a);
        return a;
    }
}

class main{
    public static void main(String args[])
    {
        triangle t=new triangle(5,3);
        rectangle r=new rectangle(6,7);
        circle c=new circle(5,0);
        cylinder cy=new cylinder(7,9);
        
        figure ref;
        ref=t;
        System.out.print("Area of the triangle is : ");
        ref.area();
        ref=r;
        
        System.out.print("Area of the rectangle is : ");
        ref.area();
        ref=c;
        
        System.out.print("Area of the circle is : ");
        ref.area();
        ref=cy;
        
        System.out.print("Area of the cylinder is : ");
        ref.area();
    }
    }
 
