import java.util.Scanner;
public class Manager
{
Manager()
{
Scanner scan=new Scanner(System.in);

System.out.println("Enter Manager id");
int id=scan.nextInt();
System.out.println("Enter Manager name");
String name=scan.next();
System.out.println("Enter Manager mobile no");
long mno=scan.nextLong();
System.out.println("Enter Manager salary");
double sal=scan.nextDouble();
System.out.println("Enter Manager status");
boolean sts=scan.nextBoolean();
System.out.println("Enter Manager address");
String add=scan.next()+scan.nextLine();

System.out.println("Manager id " +id);
System.out.println("Manager name" +name);
System.out.println("Manager mobile no" +mno);
System.out.println("Manager salary" +sal);
System.out.println("Manager status" +sts);
System.out.println("Manager address" +add);
}
}