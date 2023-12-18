class A
{
int x=50;
int y=30;
public void m1()
{
System.out.println("m1 of class A");
}
public void m3()
{
System.out.println("m3 of class A");
}
}


class B extends A
{
int x=60;
int z=50;
public void m2()
{
System.out.println("m2 of class B");
}
public void m4()
{
System.out.println("m4 of class B");
}
}


class C extends A
{
int x=100;
int z=70;
int n=7;
public void m2()
{
System.out.println("m2 of class C");
}
public void m3()
{
System.out.println("m3 of class C");
}
public void m4()
{
System.out.println("m4 of class C");
}
}


class D extends B
{
int y=60;
int z=20;
public void m1()
{
System.out.println("m1 of class D");
}
public void m2()
{
System.out.println("m2 of class D");
}
public void m3()
{
System.out.println("m3 of class D");
}
}



class Test
{
public static void main(String[] args)
{
A a=new A();
a.m1();
a.m3();
System.out.println(a.x);
System.out.println(a.y);

B b=new B();
b.m1();
b.m2();
b.m3();
b.m4();
System.out.println(b.x);
System.out.println(b.y);
System.out.println(b.z);

C c=new C();
c.m1();
c.m2();
c.m3();
c.m4();
System.out.println(c.x);
System.out.println(c.y);
System.out.println(c.z);
System.out.println(c.n);

D d=new D();
d.m1();
d.m2();
d.m3();
d.m4();
System.out.println(d.x);
System.out.println(d.y);
System.out.println(d.z);

A a1=new B();
a1.m1();
a1.m3();
System.out.println(a1.x);
System.out.println(a1.y);

A a2=new C();
a2.m1();
a2.m3();
System.out.println(a2.x);
System.out.println(a2.y);

A a3=new D();
a3.m1();
a3.m3();
System.out.println(a3.x);
System.out.println(a3.y);

B b1=new D();
b1.m1();
b1.m2();
b1.m3();
b1.m4();
System.out.println(b1.x);
System.out.println(b1.y);
System.out.println(b1.z);

}
}