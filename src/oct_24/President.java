import java.util.Scanner;
public class President
{
President()
{
Scanner scan=new Scanner(System.in);

System.out.println("Enter President id");
int id=scan.nextInt();
System.out.println("Enter President name");
String name=scan.next();
System.out.println("Enter President mobile no");
long mno=scan.nextLong();
System.out.println("Enter President salary");
double sal=scan.nextDouble();
System.out.println("Enter President status");
boolean sts=scan.nextBoolean();
System.out.println("Enter President address");
String add=scan.next()+scan.nextLine();

System.out.println("President id " +id);
System.out.println("President name" +name);
System.out.println("President mobile no" +mno);
System.out.println("President salary" +sal);
System.out.println("President status" +sts);
System.out.println("President address" +add);
}
}