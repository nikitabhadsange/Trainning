import java.util.Scanner;
public class Student
{
public Student()
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter student id");
int id=scan.nextInt();
System.out.println("Enter student name");
String name=scan.next();
System.out.println("Enter student address");
String add=scan.next()+scan.nextLine();
System.out.println("Enter student mobile number");
int mobno=scan.nextInt();
System.out.println("Id" +id);
System.out.println("name" +name);
System.out.println("Address" +add);
System.out.println("mobile number" +mobno);

}
}