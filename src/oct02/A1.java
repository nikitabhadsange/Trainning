public class A1
{
public int m1()
{
System.out.println("m1() method of A1");
return 10;
}
public static void main(String args[])
{
A1 a = new A1();
//a.m1();

//System.out.println(a.m1());

int b = a.m1();
System.out.println(b);
}
}