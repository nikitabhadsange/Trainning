package com.cjc.dev.teamlead;
import java.util.Scanner;
public class Teamlead
{
Scanner scan=new Scanner(System.in);
public void teamleadInfo()
{
System.out.println("Enter teamlead name" );
String n=scan.next();
System.out.println("Name is :" +n);

System.out.println("Enter teamlead Id");
int id=scan.nextInt();
System.out.println("Id is :" +id);

System.out.println("Enter teamlead mobile No");
int mn=scan.nextInt();
System.out.println("Mobile no is:" +mn);


System.out.println("Enter teamlead address");
String add=scan.next()+scan.nextLine();
System.out.println("Address is:" +add);

System.out.println("Enter teamlead Salary");
float s=scan.nextFloat();
System.out.println("Salary is :" +s);
}
}