import java.util.Scanner;
public class Company01
{
Scanner scan=new Scanner(System.in);
public void manager()
{
System.out.println("Manager name:");
String s=scan.next();
System.out.println(s);

System.out.println("Salary is:");
int i=scan.nextInt();
System.out.println(i);

System.out.println("Experience is:");
float f=scan.nextFloat();
System.out.println(f);

System.out.println("Age is");
int i1=scan.nextInt();
System.out.println(i1);

System.out.println("Department is:");
String s1=scan.next();
System.out.println(s1);
}

public void employee()
{
System.out.println("Employee Name:");
String s=scan.next();
System.out.println(s);

System.out.println("Employee Salary");
int i=scan.nextInt();
System.out.println(i);

System.out.println("City is:");
String s3=scan.next();
System.out.println("s3");

System.out.println("Age is");
int i3=scan.nextInt();
System.out.println(i3);

System.out.println("Department is:");
String s5=scan.next();
System.out.println(s5);
}
}