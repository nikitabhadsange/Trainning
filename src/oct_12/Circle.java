import java.util.Scanner;
public class Circle
{
Scanner scan=new Scanner(System.in);
public void area()
{
System.out.println("Enter d");
float d=scan.nextFloat();

System.out.println("Enter pi");
float pi=scan.nextFloat();

float area=2*pi*d;
System.out.println(area);
}
public static void main(String args[])
{
Circle c=new Circle();
c.area();
}
}