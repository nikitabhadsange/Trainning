public class A
{
public void m1()
{
System.out.println("m1 method");
}

public void m2(int a,int b)
{
System.out.println(a+b);
}

public String m3()
{
System.out.println("m3 method");
return "Niikii";
}

public float m4(String s)
{
System.out.println(s);
return 25.5f;
}

public static void main(String args[])
{
A a = new A();
a.m1();
a.m2(10,5);
System.out.println(a.m3());
System.out.println(a.m4("Nikita"));
}
}