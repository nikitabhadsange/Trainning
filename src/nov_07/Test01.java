//check which return statement are valid for methods and its output

class A
{
public String toString()
{
return "A class";
}
}

class B extends A
{
public String toString()
{
return "B class";
}
}

class C extends B
{
public String toString()
{
return "C class";
}
}

class Test01
{
public A m1()
{
A a=new A();
B b=new B();
C c=new C();
//return a;
//return b;
return c;
}
public B m2()
{
A a=new A();
B b=new B();
C c=new C();
//return b;
return c;
}
public C m3()
{
A a=new A();
B b=new B();
C c=new C();
return c;

}

public static void main(String[] args)
{
Test01 t=new Test01();
System.out.println(t.m1());
System.out.println(t.m2());
System.out.println(t.m3());
}
}