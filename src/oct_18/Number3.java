package IfelseDemo.divisibleNumber;
import java.util.Scanner;
public class Number3
{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter no");
int n=scan.nextInt();

if(n%3==0 && n%5==0)
{
System.out.println("Number is divisible");
}
else
{
System.out.println("Number is not divisible");
}
}
}