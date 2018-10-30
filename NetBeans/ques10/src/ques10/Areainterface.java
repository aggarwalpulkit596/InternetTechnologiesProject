package Ques10;
import java.util.*;
interface Rect
{
    public void RectArea(double l,double b);
}
interface Tri
{        
    public void TriArea(double b,double h);
}
class Area implements Rect,Tri
{
    public void RectArea(double l,double b)
    {
        System.out.println("Area of rectangle is="+(l*b));
    }
    public void TriArea(double b,double h)
    {
        System.out.println("Area of triangle is="+(b*h/2));
    }
}
public class Areainterface
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int ch;
        Area ar=new Area();
        System.out.println("1.For Area of rectangle\n2.For Area of triangle");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:double len,bre;
            System.out.println("Enter length and breadth of a rectangle");
            len=sc.nextDouble();
            bre=sc.nextDouble();
            ar.RectArea(len,bre);
            break;
            case 2:double bas,hei;
            System.out.println("Enter the base and height of a triangle");
            bas=sc.nextDouble();
            hei=sc.nextDouble();
            ar.TriArea(bas,hei);
            break;
            default:System.out.println("Enter a valid choice");
        }
    }
}

