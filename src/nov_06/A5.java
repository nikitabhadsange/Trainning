//count of multiplication of 4 to 120

public class A5
{
public static void main(String[] args)
{
int count=0;
int i=1;
do
{
if(i%4==0)
{
count++;
}

i++;
}
while(i<=120);
System.out.println(count);
}
}