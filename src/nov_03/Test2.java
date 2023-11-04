class A1
{
String s1;
char ch;
public void m1()
{
System.out.println("m1 method of A1");
}
public void m2()
{
System.out.println("m2 method of A1");
}
}
 

class B1 extends A1
{
public void show1()
{
s1="abc";
System.out.println(s1);

m1();
System.out.println("show1 method of B1");
}
public void show2()
{
ch='a';
System.out.println(ch);

m2();
}
}

public class Test2
{
public static void main(String [] args)
{
B1 b1=new B1();
b1.show1();
b1.show2();
}
}