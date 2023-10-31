public class Test1
{
public int sum(int x,int y)
{
int z=x+y;
return z;
}
public static void main(String[] args)
{
Test t=new Test();
int x1=t.sum(100,300);
System.out.println(x1);
}
}