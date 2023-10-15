package com.User;
import java.util.Scanner;
public class Aadhar
{
Scanner scan=new Scanner(System.in);
public void details()
{

System.out.println("Aadhar no:");
int i=scan.nextInt();
System.out.println(i);

System.out.println("Aadhar name:");
String s=scan.next()+scan.nextLine();
System.out.println(s);

System.out.println("Mobile no:");
long m=scan.nextLong();
System.out.println(m);


}

public static void main(String args[])

{
Aadhar a=new Aadhar();
a.details();
}
}