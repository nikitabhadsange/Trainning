package com.cjc.dev.trainee;
import java.util.Scanner;
public class Trainee
{
public void trainerInfo()
Scanner scan=new Scanner(System.in)
{
System.out.println("Enter trainee name" )
String n=scan.next();
System.out.println("Name is :" +n);

System.out.println("Enter trainee Id");
int id=scan.nextInt();
System.out.println("Id is :" +id);

System.out.println("Enter trainee mobile No");
int mn=scan.nextInt();
System.out.println("Mobile no is:" +mn);


System.out.println("Enter trainee address");
String add=scan.next()+scan.nextLine();
System.out.println("Address is:" +add);

System.out.println("Enter trainee Salary");
float s=scan.nextFloat();
System.out.println("Salary is :" +s);
}
}