import java.util.Scanner;

public class Test1
{
public void addition(int a,int b)
{
int c=a+b;
System.out.println(c);
}
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter first no:");
int x=scan.nextInt();
System.out.println("enter second no:");
int y=scan.nextInt();

Test1 t=new Test1();
t.addition(x,y);
t.addition(800,500);
}
}
