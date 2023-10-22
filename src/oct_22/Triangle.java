import java.util.Scanner;
public class Triangle
{
public void perimeter()
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter sides");
int a=scan.nextInt();
int b=scan.nextInt();
int c=scan.nextInt();
System.out.println("Perimeter is   "+(a+b+c));

}
}