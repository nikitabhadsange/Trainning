import java.util.Scanner;

public class Calculator
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter first no:");
int i=scan.nextInt();
System.out.println(i);

System.out.println("Enter second no:");
int j=scan.nextInt();
System.out.println(j);

System.out.println("sum is:" +(i+j));
System.out.println("Substraction is:" +(i-j));
System.out.println("Product is:" +(i*j));
System.out.println("Division is:" +(i/j));

}

}