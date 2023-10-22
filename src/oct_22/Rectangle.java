import java.util.Scanner;
public class Rectangle
{
public void area()
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter length");
int l=scan.nextInt();
System.out.println("Enter width");
int w=scan.nextInt();

System.out.println("Area is " +(l*w));
int area=l*w;
}

public void perimeter()
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter length");
int l1=scan.nextInt();
System.out.println("Enter width");
int w1=scan.nextInt();

System.out.println("Perimeter is " +(2*(l1+w1)));
int perimeter=2*(l1+w1);
}
}