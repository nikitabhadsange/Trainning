package com.cjc.Nesteddemo;
import java.util.Scanner;
public class Number
{
public static void main(String [] args)
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter number");
int n=scan.nextInt();

if(n>=0&&n<=100)
{
System.out.println("Number is positive");

if(n%2==0)
{
System.out.println("number is even");
}
else
{
System.out.println("number is odd");
}
}
else 
{
System.out.println("not a valid number");
}
}
}