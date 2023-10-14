import java.util.Scanner;
public class Bank
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
System.out.println("Bank name");
String s=scan.next();
System.out.println(s);

System.out.println("Manager name");
String s1=scan.next();
System.out.println(s1);

System.out.println("IFSC code");
int i=scan.nextInt();
System.out.println(i);

System.out.println("Branch name");
String s3=scan.next();
System.out.println(s3);
}


}