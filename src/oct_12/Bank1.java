import java.util.Scanner;

public class Bank1
{
public void viewDetails()
{
Scanner scan=new Scanner(System.in);

System.out.println("Account no.:");
long l=scan.nextLong();
System.out.println(l);

System.out.println("Enter name:");
String s=scan.next();
System.out.println(s);

System.out.println("Enter age:");
int i=scan.nextInt();
System.out.println(i);

System.out.println("Enter city:");
String s1=scan.next();
System.out.println(s1);

System.out.println("Enter balance:");
float a=scan.nextFloat();
System.out.println(a); 
}

public void deposit()
{
System.out.println("Deposit amount:");
float f=scan.nextFloat();
System.out.println(f);

System.out.println(a+f);

}


public static void main(String args[])
{
Bank1 b1=new Bank1();
b1.viewDetails();
}

}