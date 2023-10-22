import java.util.Scanner;
public class Square
{
public void area()
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter side of area");
int a=scan.nextInt();
System.out.println("Area is   " +(a*a));
int area=a*a;
}
public void perimeter()
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter side of perimeter");
int s=scan.nextInt();
System.out.println("Perimeter is  " +(4*s));
int perimeter=4*s;
}
}