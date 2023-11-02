//Prime number or not

public class Prime
{
public static void main(String[] args)
{
int factor=0;
int no=1;
for(int i=2;i<=no;i++)
{
if(no%i==0)
{
factor++;
}
}
if(factor==2)
{
System.out.println("Number is prime");
}
else
{
System.out.println("Number is not a prime number");
}
}
}