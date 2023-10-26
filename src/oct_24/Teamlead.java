import java.util.Scanner;
public class Teamlead
{
Teamlead()
{
Scanner scan=new Scanner(System.in);

System.out.println("Enter Teamlead id");
int id=scan.nextInt();
System.out.println("Enter Teamlead name");
String name=scan.next();
System.out.println("Enter Teamlead mobile no");
long mno=scan.nextLong();
System.out.println("Enter Teamlead salary");
double sal=scan.nextDouble();
System.out.println("Enter Teamlead status");
boolean sts=scan.nextBoolean();
System.out.println("Enter Teamlead address");
String add=scan.next()+scan.nextLine();

System.out.println("Teamlead id " +id);
System.out.println("Teamlead name" +name);
System.out.println("Teamlead mobile no" +mno);
System.out.println("Teamlead salary" +sal);
System.out.println("Teamlead status" +sts);
System.out.println("Teamlead address" +add);
}
}