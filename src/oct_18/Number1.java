package Ifelsedemo.positiveorNegative;
import java.util.Scanner;
public class Number1
{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);

System.out.println("Enter n" );
int n=scan.nextInt();
if(n>=0&&n==0)
{
System.out.println("Number is positive");
}
else
{
System.out.println("number is negative");
}

} 
}
