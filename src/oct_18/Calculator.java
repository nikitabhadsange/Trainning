import java.util.Scanner;
public class Calculator
{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);

System.out.println("Enter value");

int n=scan.nextInt();
if(n==1&&n>=10)
{
Addition a1=new Addition();
a1.add();
}
if(n==2&&n>=10)
{
Substraction s=new Substraction();
s.sub();
}
if(n==3&&n>=10)
{
Multiplication m=new Multiplication();
m.mul();
}
if(n==4&&n>=10)
{
Division d=new Division();
d.div();
}
}
}