import java.util.Scanner;
public class Test
{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);

System.out.println("Enter student id");
int id=scan.nextInt();
System.out.println("Enter student name");
String name=scan.next();
System.out.println("Enter student status");
boolean status=scan.nextBoolean();
System.out.println("Enter student weight");
double weight=scan.nextDouble();
System.out.println("Enter student height");
float height=scan.nextFloat();
System.out.println("Enter student mobno");
long mobno=scan.nextLong();
System.out.println("Enter student add");
String add=scan.next();
Student s=new Student();
s.setId(id);
s.setName(name);
s.setStatus(status);
s.setWeight(weight);
s.setHeight(height);
s.setMobno(mobno);
s.setAdd(add);
System.out.println(s.getId());
System.out.println(s.getName());
System.out.println(s.getStatus());
System.out.println(s.getHeight());
System.out.println(s.getWeight());
System.out.println(s.getMobno());
System.out.println(s.getAdd());

System.out.println("Enter School id1");
int id1=scan.nextInt();
System.out.println("Enter School name1");
String name1=scan.next();
System.out.println("Enter School status1");
boolean status1=scan.nextBoolean();
System.out.println("Enter School area");
double area1=scan.nextDouble();
System.out.println("Enter School no of student1");
int noofstud1=scan.nextInt();
System.out.println("Enter School phone no1");
long phoneno1=scan.nextLong();
System.out.println("Enter School add1");
String add1=scan.next();
School s1=new School();
s1.setId1(id1);
s1.setName1(name1);
s1.setStatus1(status1);
s1.setArea1(area1);
s1.setPhoneno1(phoneno1);
s1.setNoofstud1(noofstud1);
s1.setAdd1(add1);
System.out.println(s1.getId1());
System.out.println(s1.getName1());
System.out.println(s1.getStatus1());
System.out.println(s1.getArea1());
System.out.println(s1.getPhoneno1());
System.out.println(s1.getNoofstud1());
System.out.println(s1.getAdd1());

System.out.println("Enter College id2");
int id2=scan.nextInt();
System.out.println("Enter College name2");
String name2=scan.next();
System.out.println("Enter College status2");
boolean status2=scan.nextBoolean();
System.out.println("Enter College area2");
double area2=scan.nextDouble();
System.out.println("Enter College no of department2");
int noofdept2=scan.nextInt();
System.out.println("Enter College phone no2");
long phoneno2=scan.nextLong();
System.out.println("Enter College add2");
String add2=scan.next();
College c=new College();
c.setId2(id2);
c.setName2(name2);
c.setStatus2(status2);
c.setArea2(area2);
c.setPhoneno2(phoneno2);
c.setNoofdept2(noofdept2);
c.setAdd2(add2);
System.out.println(c.getId2());
System.out.println(c.getName2());
System.out.println(c.getStatus2());
System.out.println(c.getArea2());
System.out.println(c.getPhoneno2());
System.out.println(c.getNoofdept2());
System.out.println(c.getAdd2());

System.out.println("Enter University id3");
int id3=scan.nextInt();
System.out.println("Enter University name3");
String name3=scan.next();
System.out.println("Enter University status3");
boolean status3=scan.nextBoolean();
System.out.println("Enter University area3");
double area3=scan.nextDouble();
System.out.println("Enter University no of department3");
int noofdept3=scan.nextInt();
System.out.println("Enter University phone no3");
long phoneno3=scan.nextLong();
System.out.println("Enter University add3");
String add3=scan.next();
University u=new University();
u.setId3(id3);
u.setName3(name3);
u.setStatus3(status3);
u.setArea3(area3);
u.setPhoneno3(phoneno3);
u.setNoofdept3(noofdept3);
u.setAdd3(add3);
System.out.println(u.getId3());
System.out.println(u.getName3());
System.out.println(u.getStatus3());
System.out.println(u.getArea3());
System.out.println(u.getPhoneno3());
System.out.println(u.getNoofdept3());
System.out.println(u.getAdd3());


}
}