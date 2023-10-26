import java.util.Scanner;
public class School
{
public School()
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter school id");
int id=scan.nextInt();
System.out.println("Enter school name");
String name=scan.next();
System.out.println("Enter school address");
String add=scan.next()+scan.nextLine();
System.out.println("Enter school mobno");
int mobno=scan.nextInt();

System.out.println("Id" +id);
System.out.println("name" +name);
System.out.println("Address" +add);
System.out.println("mobile number" +mobno);

}

}