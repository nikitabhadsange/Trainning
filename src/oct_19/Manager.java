package com.cjc.dev.manager;
import java.util.Scanner;
public class Manager
{
Scanner scan=new Scanner(System.in);
public void managerInfo()
{
System.out.println("Enter manager name" );
String n=scan.next();
System.out.println("Name is :" +n);

System.out.println("Enter manager Id");
int id=scan.nextInt();
System.out.println("Id is :" +id);

System.out.println("Enter manager mobile No");
int mn=scan.nextInt();
System.out.println("Mobile no is:" +mn);


System.out.println("Enter manager address");
String add=scan.next()+scan.nextLine();
System.out.println("Address is:" +add);

System.out.println("Enter manager Salary");
float s=scan.nextFloat();
System.out.println("Salary is :" +s);
}
}