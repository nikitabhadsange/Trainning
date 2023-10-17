import java.util.Scanner;
public class Program01
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter first no:");
int a=scan.nextInt();
System.out.println(a);

System.out.println("Enter second no:");
int b=scan.nextInt();
System.out.println(b);

System.out.println("sum is:" +(a+b));
System.out.println("Product is:" +(a*b));

}
}