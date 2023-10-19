package com.cjc.dev.director;
import java.util.Scanner;
public class Director
{
Scanner scan=new Scanner(System.in);
public void directorInfo()
{
System.out.println("Enter director name" );
String n=scan.next();
System.out.println("Name is :" +n);

System.out.println("Enter director Id");
int id=scan.nextInt();
System.out.println("Id is :" +id);

System.out.println("Enter director mobile No");
int mn=scan.nextInt();
System.out.println("Mobile no is:" +mn);


System.out.println("Enter director address");
String add=scan.next()+scan.nextLine();
System.out.println("Address is:" +add);

System.out.println("Enter director Salary");
float s=scan.nextFloat();
System.out.println("Salary is :" +s);
}
}