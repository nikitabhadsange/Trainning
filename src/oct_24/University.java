import java.util.Scanner;
public class University
{
public University()
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter University id");
int id=scan.nextInt();
System.out.println("Enter University name");
String name=scan.next();
System.out.println("Enter University address");
String add=scan.next()+scan.nextLine();
System.out.println("Enter University mobno");
int mobno=scan.nextInt();

System.out.println("Id" +id);
System.out.println("name" +name);
System.out.println("Address" +add);
System.out.println("mobile number" +mobno);

}
}