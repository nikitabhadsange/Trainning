import java.util.Scanner;
public class Program08
{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter first no");
int a=scan.nextInt();
System.out.println("Enter second no");
int b=scan.nextInt();
if(a<50&&a<b)
{
System.out.println("Both condidtions are true");
}
else
{
System.out.println("At least one condidtion is false");
}
}
}