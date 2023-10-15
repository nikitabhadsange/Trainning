package com.mathsUtil;
import java.util.Scanner;
public class Addition
{
Scanner scan=new Scanner(System.in);
public void add()
{
System.out.println("First no:");
int a=scan.nextInt();
System.out.println(a);

System.out.println("Second no:");
int b=scan.nextInt();
System.out.println(b);

System.out.println(a+b);
}
}