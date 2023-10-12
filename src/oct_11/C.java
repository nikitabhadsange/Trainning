public class C
{
public int m4(String s)
{
System.out.println("m4 method");
System.out.println(s);
return 5;
}

public static void main(String args[])
{
B b = new B();
b.m1();
b.m2(10,20);
System.out.println(b.m3());

C c = new C();
System.out.println(c.m4("Nikita"));
}
}