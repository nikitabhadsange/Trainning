import java.util.Scanner;
public class Login
{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter username");
String name=scan.next();
//String s="Nikita123";

if(name.equals("Nikita123"))
{
System.out.println("Enter password");
int p=scan.nextInt();

if(p==1234)
{
System.out.println("logged in successfully");
}
else
System.out.println("Wrong input");
}
else
System.out.println("Invalid username");
}
}