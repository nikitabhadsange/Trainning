import java.util.Scanner;

public class Calculator1
{
public void method()
{
Scanner scan=new Scanner(System.in);

System.out.println("Enter first no:");
int a=scan.nextInt();
System.out.println(a);

System.out.println("Enter second no:");
int b=scan.nextInt();
System.out.println(b);

System.out.println("sum is:" +(a+b));
System.out.println("Substraction is:" +(a-b));
System.out.println("Product is:" +(a*b));
System.out.println("Division is:" +(a/b));
}

  
{
Calculator1 c1=new Calculator1();
c1.method();
}
}