import java.util.Scanner;
public class Prime
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the num ");
int n=sc.nextInt();
int i=1;
int count=0;
do
{ 
	
	if(n%i==0)
	{
	count ++;
	}
  i++;
}while(i<=n);
if(count==2)
	{
	System.out.println("this is prime num:-"+n);
	} 
else
	{
	System.out.println("num is not prime:-"+n);
	} 
}
}