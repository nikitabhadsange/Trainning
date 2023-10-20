package com.Ladderdemo;
import java.util.Scanner;
public class Test1
{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter marks: ");
int marks=scan.nextInt();

if(marks<=100&&marks>=90)
{
System.out.println("Topper");
}
if(marks<=90&&marks>=75)
{
System.out.println("Distinction");
}
if(marks<=75&&marks>=60)
{
System.out.println("First class");
}
if(marks<=60&&marks>=45)
{
System.out.println("Second class");
}
if(marks<=45&&marks>=35)
{
System.out.println("Third class");
}
if(marks<=35&&marks>=00)
{
System.out.println("Fail");
}

}
}