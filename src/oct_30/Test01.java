import java.util.Scanner;
public class Test01
{
Scanner scan=new Scanner(System.in);
public Student setStudent()
{
Student s=new Student();
System.out.println("Enter id");
s.setId(scan.nextInt());

System.out.println("Enter name");
s.setName(scan.next());

System.out.println("Enter status");
s.setStatus(scan.nextBoolean());

System.out.println("Enter weight");
s.setWeight(scan.nextDouble());

System.out.println("Enter height");
s.setHeight(scan.nextFloat());

System.out.println("Enter mobile number");
s.setMobno(scan.nextLong());

System.out.println("Enter address");
s.setAdd(scan.next());
return s;
}

public School setSchool()
{
School s1=new School();
System.out.println("Enter School id1");
s1.setId1(scan.nextInt());

System.out.println("Enter School name1");
s1.setName1(scan.next());

System.out.println("Enter School status1");
s1.setStatus1(scan.nextBoolean());

System.out.println("Enter School area1");
s1.setArea1(scan.nextDouble());

System.out.println("Enter School phone number");
s1.setPhoneno1(scan.nextLong());

System.out.println("Enter School number of student");
s1.setNoofstud1(scan.nextInt());

System.out.println("Enter School address");
s1.setAdd1(scan.next());

return s1;
}

public College setCollege()
{
College c=new College();
System.out.println("Enter College id2");
c.setId2(scan.nextInt());

System.out.println("Enter College name2");
c.setName2(scan.next());

System.out.println("Enter College status2");
c.setStatus2(scan.nextBoolean());

System.out.println("Enter College area2");
c.setArea2(scan.nextDouble());

System.out.println("Enter College phone number2");
c.setPhoneno2(scan.nextLong());

System.out.println("Enter College number of department2");
c.setNoofdept2(scan.nextInt());

System.out.println("Enter College address2");
c.setAdd2(scan.next());
return c;
}

public University setUniversity()
{
University u=new University();
System.out.println("Enter University id2");
u.setId3(scan.nextInt());

System.out.println("Enter University name2");
u.setName3(scan.next());

System.out.println("Enter University status2");
u.setStatus3(scan.nextBoolean());

System.out.println("Enter University area2");
u.setArea3(scan.nextDouble());

System.out.println("Enter University phone number2");
u.setPhoneno3(scan.nextLong());

System.out.println("Enter University number of department2");
u.setNoofdept3(scan.nextInt());

System.out.println("Enter University address2");
u.setAdd3(scan.next());

System.out.println("Enter University pin code3");
u.setPincode3(scan.nextInt());
return u;
}


public void getStudent(Student stu)
{
System.out.println(stu.getId());
System.out.println(stu.getName());
System.out.println(stu.getStatus());
System.out.println(stu.getWeight());
System.out.println(stu.getHeight());
System.out.println(stu.getMobno());
System.out.println(stu.getAdd());
}

public void getSchool(School sc)
{
System.out.println(sc.getId1());
System.out.println(sc.getName1());
System.out.println(sc.getStatus1());
System.out.println(sc.getArea1());
System.out.println(sc.getPhoneno1());
System.out.println(sc.getNoofstud1());
System.out.println(sc.getAdd1());
}

public void getCollege(College clg)
{
System.out.println(clg.getId2());
System.out.println(clg.getName2());
System.out.println(clg.getStatus2());
System.out.println(clg.getArea2());
System.out.println(clg.getPhoneno2());
System.out.println(clg.getNoofdept2());
System.out.println(clg.getAdd2());
}

public void getUniversity(University un)
{
System.out.println(un.getId3());
System.out.println(un.getName3());
System.out.println(un.getStatus3());
System.out.println(un.getArea3());
System.out.println(un.getPhoneno3());
System.out.println(un.getNoofdept3());
System.out.println(un.getAdd3());
System.out.println(un.getPincode3());
}

public static void main(String[] args)
{
Test01 t=new Test01();
Student s=t.setStudent();
t.getStudent(s);

School s1=t.setSchool();
t.getSchool(s1);

College c=t.setCollege();
t.getCollege(c);

University u=t.setUniversity();
t.getUniversity(u);
}
}