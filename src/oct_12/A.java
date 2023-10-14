import java.util.Scanner;
public class A
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter first no:");
int x=scan.nextInt();
System.out.println(x);
System.out.println("Enter second no.:");
float y=scan.nextFloat();
System.out.println(y);

System.out.println();

System.out.println("Enter no:");
byte b=scan.nextByte();
System.out.println(b);

System.out.println("Enter short value:");
short s=scan.nextShort();
System.out.println(s);
System.out.println("Enter long value:");
long l=scan.nextLong();
System.out.println(l);

System.out.println("Enter double value:");
double d=scan.nextDouble();
System.out.println(d);
System.out.println("Enter string");
String s1=scan.next();
System.out.println(s1);

System.out.println("Enter boolean value:");
boolean b1=scan.nextBoolean();
System.out.println(b1);
System.out.println("Enter char:");
char c=scan.next().charAt(0);
System.out.println(c);
}
}