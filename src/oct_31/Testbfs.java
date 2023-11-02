import java.util.Scanner;
public class Testbfs
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
Batch b=new Batch();
System.out.println("Enter Batch id");
b.setBid(scan.nextInt());
System.out.println("Enter Batch name");
b.setBname(scan.next());

Faculty f=new Faculty();
System.out.println("Enter Faculty id");
f.setFid(scan.nextInt());
System.out.println("Enter Faculty name");
f.setFname(scan.next());
f.setBatch(b);

Student s=new Student();
System.out.println("Enter Student name");
s.setName(scan.next());
System.out.println("Enter Student college fees");
s.setClgfees(scan.nextDouble());
System.out.println("Enter Student Marks");
s.setMark(scan.nextFloat());
System.out.println("Enter Student Gender");
s.setGender(scan.next().charAt(0));
s.setFaculty(f);

System.out.println(s.getName());
System.out.println(s.getClgfees());
System.out.println(s.getMark());
System.out.println(s.getGender());
System.out.println(s.getFaculty().getFid());
System.out.println(s.getFaculty().getFname());
System.out.println(s.getFaculty().getBatch().getBid());
System.out.println(s.getFaculty().getBatch().getBname());

}
}