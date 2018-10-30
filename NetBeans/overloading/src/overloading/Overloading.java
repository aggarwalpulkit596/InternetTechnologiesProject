package overloading;
/* Write a java program that computes the area of cylinder,rectangle,circle
using function overloading */
public class Overloading
       
{
    void area(float x,float y)
    {
        System.out.println("the total area of the cylinder is "+2*3.14*x*(x+y)+" sq units");
    }
    void area1(float x, float y)
    {
        System.out.println("the area of the rectangle is "+x*y+" sq units");
    }
    void area(double x)
    {
        double z = 3.14 * x * x;
        System.out.println("the area of the circle is "+z+" sq units");
    }
     public static void main(String args[]) 
	{
	   Overloading ob = new Overloading();
	   ob.area(2,1);
	   ob.area1(11,12);
	   ob.area(2.5);
        }
}
    
    

