/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KMV
 */
class Figure{
	double dim1,dim2;
	Figure(double x,double y)
	{
		dim1=x;
		dim2=y;
	}
		double area()
		{
			return 0;
		}
}

	class Circle extends Figure
	{
		Circle(double x)
		{
			super(x,0);
		}
			double area()
			{double a;
			a=(3.14*dim1*dim1);
                        System.out.println("area of Circle is: "+a);
			return a;
			}
		}
	class Rectangle extends Figure
	{
		Rectangle(double x,double y)
		{
			super(x,y);
		}
		double area()
		{double a;
		a=(dim1*dim2);
                System.out.println("area of Rectangle is: "+a);
                       
		return a;
		}
	}
	class Cylinder extends Figure
	{
		Cylinder(double x,double y)
		{
			super(x,y);
		}
		double area()
		{double a;
		a=(2*3.14*dim1*dim2);
                System.out.println("area of Cylinder is: "+a);
		return a;
		}
	}
	class OverRide{
		public static void main(String args[])
		{
			Figure F=new Figure(5,3);
			Circle c=new Circle(5);
			Rectangle r=new Rectangle(3,3);
			Cylinder C=new Cylinder(7,8);
			
			Figure  ref;
			
			ref =F;
			ref.area();
			
			ref =c;
			ref.area();
			
			ref =r;
			ref.area();
			
			ref =C;
			ref.area();
		}
	}
		

