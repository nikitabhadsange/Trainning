import java.util.Scanner;
public class Company
{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);

System.out.println("Enter id");
int id=scan.nextInt();
System.out.println("Enter name");
String name=scan.next();
System.out.println("Enter mobile number");
int mno=scan.nextInt();
System.out.println("Enter salary");
double salary=scan.nextDouble();
System.out.println("Enter status");
boolean status=scan.nextBoolean();
System.out.println("Enter address");
String add=scan.next();
Trainee t=new Trainee(id,name,mno,salary,status,add);
System.out.println(t.id);
System.out.println(t.name);
System.out.println(t.mno);
System.out.println(t.salary);
System.out.println(t.status);
System.out.println(t.add);

System.out.println("Enter id");
int id1=scan.nextInt();
System.out.println("Enter name");
String name1=scan.next();
System.out.println("Enter mobile number");
int mno1=scan.nextInt();
System.out.println("Enter salary");
double salary1=scan.nextDouble();
System.out.println("Enter status");
boolean status1=scan.nextBoolean();
System.out.println("Enter address");
String add1=scan.next();
Teamlead tl=new Teamlead(id1,name1,mno1,salary1,status1,add1);
System.out.println(tl.id);
System.out.println(tl.name);
System.out.println(tl.mno);
System.out.println(tl.salary);
System.out.println(tl.status);
System.out.println(tl.add);

System.out.println("Enter id");
int id2=scan.nextInt();
System.out.println("Enter name");
String name2=scan.next();
System.out.println("Enter mobile number");
int mno2=scan.nextInt();
System.out.println("Enter salary");
double salary2=scan.nextDouble();
System.out.println("Enter status");
boolean status2=scan.nextBoolean();
System.out.println("Enter address");
String add2=scan.next();
Manager m=new Manager(id2,name2,mno2,salary2,status2,add2);
System.out.println(m.id);
System.out.println(m.name);
System.out.println(m.mno);
System.out.println(m.salary);
System.out.println(m.status);
System.out.println(m.add);

System.out.println("Enter id");
int id3=scan.nextInt();
System.out.println("Enter name");
String name3=scan.next();
System.out.println("Enter mobile number");
int mno3=scan.nextInt();
System.out.println("Enter salary");
double salary3=scan.nextDouble();
System.out.println("Enter status");
boolean status3=scan.nextBoolean();
System.out.println("Enter address");
String add3=scan.next();
VicePresident vp=new VicePresident(id3,name3,mno3,salary3,status3,add3);
System.out.println(vp.id);
System.out.println(vp.name);
System.out.println(vp.mno);
System.out.println(vp.salary);
System.out.println(vp.status);
System.out.println(vp.add);

System.out.println("Enter id");
int id4=scan.nextInt();
System.out.println("Enter name");
String name4=scan.next();
System.out.println("Enter mobile number");
int mno4=scan.nextInt();
System.out.println("Enter salary");
double salary4=scan.nextDouble();
System.out.println("Enter status");
boolean status4=scan.nextBoolean();
System.out.println("Enter address");
String add4=scan.next();
President p=new President(id4,name4,mno4,salary4,status4,add4);
System.out.println(p.id);
System.out.println(p.name);
System.out.println(p.mno);
System.out.println(p.salary);
System.out.println(p.status);
System.out.println(p.add);




}

}