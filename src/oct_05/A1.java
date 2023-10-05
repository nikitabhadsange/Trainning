public class A1
{
public void sum()
{
System.out.println(10+20);
}
public static void main(String args[])
{
System.out.println("main start");
A1 a = new A1();
a.sum();
System.out.println("main end");
}
}