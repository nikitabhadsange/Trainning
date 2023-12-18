//evencount and oddcount

public class A9
{
public static void main(String[] args)
{

int evencount=0;
int oddcount=0;
int i=1;
do
{
if(i%2==0)
{
evencount++;
System.out.println(i);
}
else
{
oddcount++;
System.out.println(i);
}
i++;

}
while(i<=100);
System.out.println(evencount);
System.out.println(oddcount);
}
}