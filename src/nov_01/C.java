//even odd count

public class C
{
public static void main(String[] ags)
{
int evencount=0;
int oddcount=0;
for(int i=2;i<=100;i++)
{
if(i%2==0)
{
evencount++;
}
else
{
oddcount++;
}

}
System.out.println(evencount);
System.out.println(oddcount);

}
}