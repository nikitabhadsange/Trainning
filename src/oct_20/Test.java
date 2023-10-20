package com.cjc.Nesteddemo;
import java.util.Scanner;
public class Test
{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter age of person");
int age=scan.nextInt();
if(age>18&&age<=50)
{
System.out.println("Enter weight of person");
float weight=scan.nextFloat();
if(weight>=50&&weight<=90)
{
System.out.println("Person is allowed to blood donate");
}
else
{
System.out.println("Person is not allowed for blood donate");
}
}
else
{
System.out.println("Invalid input");
}
}
}