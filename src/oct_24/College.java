import java.util.Scanner;
public class College
{
public College()
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter college id");
int id=scan.nextInt();
System.out.println("Enter college name");
String name=scan.next();
System.out.println("Enter college address");
String add=scan.next()+scan.nextLine();
System.out.println("Enter college mobno");
int mobno=scan.nextInt();

System.out.println("Id" +id);
System.out.println("name" +name);
System.out.println("Address" +add);
System.out.println("mobile number" +mobno);


}
}
