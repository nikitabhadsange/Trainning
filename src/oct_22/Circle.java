import java.util.Scanner;
public class Circle
{
public void area()
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter pi");
float pi=scan.nextFloat();
System.out.println("Enter radius");
int r=scan.nextInt();
double area=pi*r*r;
System.out.println("Area is  " +(pi*r*r));
}
}