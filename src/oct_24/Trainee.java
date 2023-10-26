import java.util.Scanner;
public class Trainee
{
Trainee()
{
Scanner scan=new Scanner(System.in);

System.out.println("Enter trainee id");
int id=scan.nextInt();
System.out.println("Enter trainee name");
String name=scan.next();
System.out.println("Enter trainee mobile no");
long mno=scan.nextLong();
System.out.println("Enter trainee salary");
double sal=scan.nextDouble();
System.out.println("Enter trainee status");
boolean sts=scan.nextBoolean();
System.out.println("Enter trainee address");
String add=scan.next()+scan.nextLine();

System.out.println("Trainee id " +id);
System.out.println("Trainee name" +name);
System.out.println("Trainee mobile no" +mno);
System.out.println("Trainee salary" +sal);
System.out.println("Trainee status" +sts);
System.out.println("Trainee address" +add);
}
}