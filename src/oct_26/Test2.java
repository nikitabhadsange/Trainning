class Student
{

int id=1;
String name="abc";
boolean status=true;
double weight=50;
float height=162.0f;
long mobno=13454;
String add="Pune";
}

class School
{
int id=2;
String name="def";
boolean status=true;
double area=1234;
long phoneno=5424;
String add="Delhi";
int noofstud=50;
}

class College
{
int id=3;
String name="mno";
double area=324;
boolean status=false;
String add="Latur";
int noofdept=10;
long phoneno=65433;
}

class University
{
int id=4;
String name="pqr";
boolean status=true;
String add="Mumbai";
int noofdept=20;
long phoneno=3234564;
int pincode=345653;
}

public class Test2
{
public static void main(String[] args)
{
Student s=new Student();
System.out.println(s.id);
System.out.println(s.name);
System.out.println(s.status);
System.out.println(s.weight);
System.out.println(s.height);
System.out.println(s.mobno);
System.out.println(s.add);

School s1=new School();
System.out.println(s1.id);
System.out.println(s1.name);
System.out.println(s1.status);
System.out.println(s1.area);
System.out.println(s1.phoneno);
System.out.println(s1.add);
System.out.println(s1.noofstud);

College c=new College();
System.out.println(c.id);
System.out.println(c.name);
System.out.println(c.area);
System.out.println(c.status);
System.out.println(c.add);
System.out.println(c.noofdept);
System.out.println(c.phoneno);

University u=new University();
System.out.println(u.id);
System.out.println(u.name);
System.out.println(u.status);
System.out.println(u.add);
System.out.println(u.noofdept);
System.out.println(u.phoneno);
System.out.println(u.pincode);
}
}