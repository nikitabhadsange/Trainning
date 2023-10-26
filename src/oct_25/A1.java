//WITH SCANNER
import java.util.Scanner;
public class A1
{
int x;
String s;
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
A a=new A();
System.out.println("Enter the integer value");
a.x=scan.nextInt();
System.out.println("Enter the string value");
a.s=scan.next();
System.out.println(a.x);
System.out.println(a.s);
}
}