import java.util.Scanner;
public class VicePresident
{
VicePresident()
{
Scanner scan=new Scanner(System.in);

System.out.println("Enter VicePresident id");
int id=scan.nextInt();
System.out.println("Enter VicePresident name");
String name=scan.next();
System.out.println("Enter VicePresident mobile no");
long mno=scan.nextLong();
System.out.println("Enter VicePresident salary");
double sal=scan.nextDouble();
System.out.println("Enter VicePresident status");
boolean sts=scan.nextBoolean();
System.out.println("Enter VicePresident address");
String add=scan.next()+scan.nextLine();

System.out.println("VicePresident id " +id);
System.out.println("VicePresident name" +name);
System.out.println("VicePresident mobile no" +mno);
System.out.println("VicePresident salary" +sal);
System.out.println("VicePresident status" +sts);
System.out.println("VicePresident address" +add);
}
}