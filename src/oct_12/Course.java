import java.util.Scanner;
public class Course
{
Scanner scan=new Scanner(System.in);

public void details()
{
System.out.println("Course Name:");
String s=scan.next();
System.out.println(s);

System.out.println("Faculty name");
String s1=scan.next()+scan.nextLine();
System.out.println(s1);

System.out.println("Fees");
int i=scan.nextInt();
System.out.println(i);


}

public static void main(String args[])
{
Course c=new Course();
c.details();
}
}