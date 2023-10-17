package com.mno;
import com.abc.Rectangle;
import com.xyz.Triangle;
import com.pqr.Circle;
import java.util.Scanner;

public class Shape
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);

Rectangle r=new Rectangle();
System.out.println("Enter length :");
float length=scan.nextFloat();
System.out.println("Enter width :");
float width=scan.nextFloat();
r.area(length,width);

Triangle t=new Triangle();
System.out.println("Enter base");
float base=scan.nextFloat();
System.out.println("Enter height");
float height=scan.nextFloat();
t.area(base,height);

Circle c=new Circle();
System.out.println("Enter pi");
float pi=scan.nextFloat();
System.out.println("Enter radius");
int radius=scan.nextInt();
c.area(pi,radius);
}
}