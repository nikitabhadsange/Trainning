//even count from 1 to 100

public class A7
{
public static void main(String[] args)
{
int count=0;
int i=1;
do
{
if(i%2==0)
{
count++;
System.out.println(i);

}
i++;
}
while(i<=100);
System.out.println(count);
}
}