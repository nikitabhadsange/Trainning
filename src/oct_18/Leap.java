package IfelseDemo.leapyear;
import java.util.Scanner;
public class Leap
{
public static void main(String [] args)
{
Scanner scan=new Scanner(System.in);

System.out.println("enter year");
int n=scan.nextInt();

if(n%4==0)
{
System.out.println("Year is leap");
}

else 
{
System.out.println("Year is not leap");
}
}
}