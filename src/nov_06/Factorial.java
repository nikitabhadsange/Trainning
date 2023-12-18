//factorial of 5

public class Factorial
{
public static void main(String[] args)
{
int fact=1;
int i=1;
int no=5;
do
{

fact=fact*i;
i++;

}
while(i<=no);
System.out.println(fact);
}
}