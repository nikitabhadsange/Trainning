package com.cjc.dev.seniormanager;
import java.util.Scanner;
public class Seniormanager
{
Scanner scan=new Scanner(System.in);
public void seniormanagerInfo()
{
System.out.println("Enter seniormanager name" );
String n=scan.next();
System.out.println("Name is :" +n);

System.out.println("Enter seniormanager Id");
int id=scan.nextInt();
System.out.println("Id is :" +id);

System.out.println("Enter seniormanager mobile No");
int mn=scan.nextInt();
System.out.println("Mobile no is:" +mn);


System.out.println("Enter seniormanager address");
String add=scan.next()+scan.nextLine();
System.out.println("Address is:" +add);

System.out.println("Enter seniormanager Salary");
float s=scan.nextFloat();
System.out.println("Salary is :" +s);
}
}