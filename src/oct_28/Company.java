import java.util.Scanner;
public class Company
{

public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);

System.out.println("Enter trainee id");
int id=scan.nextInt();
System.out.println("Enter trainee name");
String name=scan.next();
System.out.println("Enter trainee mobno");
int mobno=scan.nextInt();
System.out.println("Enter trainee salary");
double salary=scan.nextDouble();
System.out.println("Enter trainee status");
boolean status=scan.nextBoolean();
System.out.println("Enter trainee address");
String add=scan.next();
Trainee t=new Trainee();
t.setId(id);
t.setName(name);
t.setMobno(mobno);
t.setSalary(salary);
t.setStatus(status);
t.setAdd(add);
System.out.println(t.getId());
System.out.println(t.getName());
System.out.println(t.getMobno());
System.out.println(t.getSalary());
System.out.println(t.getStatus());
System.out.println(t.getAdd());

System.out.println("Enter teamlead id1");
int id1=scan.nextInt();
System.out.println("Enter teamlead name1");
String name1=scan.next();
System.out.println("Enter teamlead mobno1");
int mobno1=scan.nextInt();
System.out.println("Enter teamlead salary1");
double salary1=scan.nextDouble();
System.out.println("Enter teamlead status1");
boolean status1=scan.nextBoolean();
System.out.println("Enter teamlead address1");
String add1=scan.next();
Teamlead t1=new Teamlead();
t1.setId1(id1);
t1.setName1(name1);
t1.setMobno1(mobno1);
t1.setSalary1(salary1);
t1.setStatus1(status1);
t1.setAdd1(add1);
System.out.println(t1.getId1());
System.out.println(t1.getName1());
System.out.println(t1.getMobno1());
System.out.println(t1.getSalary1());
System.out.println(t1.getStatus1());
System.out.println(t1.getAdd1());

System.out.println("Enter Manager id2");
int id2=scan.nextInt();
System.out.println("Enter Manager name2");
String name2=scan.next();
System.out.println("Enter Manager mobno2");
int mobno2=scan.nextInt();
System.out.println("Enter Manager salary2");
double salary2=scan.nextDouble();
System.out.println("Enter Manager status2");
boolean status2=scan.nextBoolean();
System.out.println("Enter Manager address2");
String add2=scan.next();
Manager m=new Manager();
m.setId2(id2);
m.setName2(name2);
m.setMobno2(mobno2);
m.setSalary2(salary2);
m.setStatus2(status2);
m.setAdd2(add2);
System.out.println(m.getId2());
System.out.println(m.getName2());
System.out.println(m.getMobno2());
System.out.println(m.getSalary2());
System.out.println(m.getStatus2());
System.out.println(m.getAdd2());

System.out.println("Enter VicePresident id3");
int id3=scan.nextInt();
System.out.println("Enter VicePresident name3");
String name3=scan.next();
System.out.println("Enter VicePresident mobno3");
int mobno3=scan.nextInt();
System.out.println("Enter VicePresident salary3");
double salary3=scan.nextDouble();
System.out.println("Enter VicePresident status3");
boolean status3=scan.nextBoolean();
System.out.println("Enter VicePresident address3");
String add3=scan.next();
VicePresident vp=new VicePresident();
vp.setId3(id3);
vp.setName3(name3);
vp.setMobno3(mobno3);
vp.setSalary3(salary3);
vp.setStatus3(status3);
vp.setAdd3(add3);
System.out.println(vp.getId3());
System.out.println(vp.getName3());
System.out.println(vp.getMobno3());
System.out.println(vp.getSalary3());
System.out.println(vp.getStatus3());
System.out.println(vp.getAdd3());

System.out.println("Enter President id4");
int id4=scan.nextInt();
System.out.println("Enter President name4");
String name4=scan.next();
System.out.println("Enter President mobno4");
int mobno4=scan.nextInt();
System.out.println("Enter President salary4");
double salary4=scan.nextDouble();
System.out.println("Enter President status4");
boolean status4=scan.nextBoolean();
System.out.println("Enter President address4");
String add4=scan.next();
President p=new President();
p.setId4(id4);
p.setName4(name4);
p.setMobno4(mobno4);
p.setSalary4(salary4);
p.setStatus4(status4);
p.setAdd4(add4);
System.out.println(p.getId4());
System.out.println(p.getName4());
System.out.println(p.getMobno4());
System.out.println(p.getSalary4());
System.out.println(p.getStatus4());
System.out.println(p.getAdd4());

}

}