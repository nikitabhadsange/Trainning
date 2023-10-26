//with scanner class

import java.util.Scanner;

public class Student
{

int sid;
String sname;
boolean sstatus;
double sweight;
float sheight;
String sadd;
long smob;
}


public class Test
{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
Student s=new Student();
System.out.println("Enter sid");
s.sid=scan.nextInt();
System.out.println("Enter name");
s.sname=scan.next();
System.out.println("Enter status");
s.sstatus=scan.nextBoolean();
System.out.println("Enter weight");
s.sweight=scan.nextDouble();
System.out.println("Enter height");
s.sheight=scan.nextFloat();
System.out.println("Enter address");
s.sadd=scan.next();
System.out.println("Enter mobileno");
s.smob=scan.nextLong();


System.out.println(s.sid);
System.out.println(s.sname);
System.out.println(s.sstatus);
System.out.println(s.sweight);
System.out.println(s.sheight);
System.out.println(s.sadd);
System.out.println(s.smob);
}
}