/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mypackage;

/**
 *
 * @author KMV
 */
class Area implements Rectangle, Triangle {

public double area1(int x, int y){
System.out.println("The Area of Rectangle is: "+x*y);
return 0;
}
public double area2(int x, int y){
System.out.println("The Area of Triangle is: "+x*y*0.5);
return 0;
}
}
