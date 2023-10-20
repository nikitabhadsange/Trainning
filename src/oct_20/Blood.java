package com.cjc.Nesteddemo;
import java.util.Scanner;
public class Blood
{
public static void main(String [] args)
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter weight");

int weight=scan.nextInt();
if(weight>=50&&weight<=75)
{
System.out.println("Person is allowed to blood donate");

System.out.println("Enter blood group");
char b=scan.next().charAt(0);
if(b=='a'||b=='b'||b=='o')
{
System.out.println("Enter age");
int age=scan.nextInt();

if(age>=22&&age<=50)
{

System.out.println("Age is allowed");
}
else
{
System.out.println("Age is not allowed");
}
}
else
{
System.out.println("Blood group is not matched");
}

}

else
{
System.out.println("Person is not allowed");
}
}
}