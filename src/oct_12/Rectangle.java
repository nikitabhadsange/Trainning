import java.util.Scanner;
public class Rectangle
{
Scanner scan=new Scanner(System.in);
public void area()
{
System.out.println("Enter l");
float l=scan.nextFloat();

System.out.println("Enter b");
float b=scan.nextFloat();

float area=l*b;
System.out.println(area);
}

public static void main(String args[])
{
Rectangle r=new Rectangle();
r.area();
}
}