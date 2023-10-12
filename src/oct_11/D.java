public class D
{
public void m1()
{
System.out.println("m1 method");
}

public void m2(int a,int b)
{
m1();
System.out.println(a+b);
}

public String m3()
{
m2(3,4);
System.out.println("m3 method");
return "Nikita";
}

public float m4(String s)
{
System.out.println(m3());
System.out.println("m4 method");
System.out.println(s);
return 5.5f;
}

public static void main(String args[])
{
D d=new D();
System.out.println(d.m4("abc"));
}
}