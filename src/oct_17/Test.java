package com.cjc.iptech;
import java.util.Scanner;
import com.cjc.mainclass.Vehicle;
public class Test
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
Vehicle v=new Vehicle();

System.out.println("Enter name");
String name=scan.next();

System.out.println("Enter color");
String color=scan.next();

System.out.println("Enter price");
float price=scan.nextFloat();

v.details(name,color,price);
}
}