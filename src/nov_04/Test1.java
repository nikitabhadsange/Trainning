class A
{
int a=10;
int b=20;
public void m1()
{
System.out.println("m1 of class A");
}
public void m2()
{
System.out.println("m2 of class A");
}
}

class B extends A
{
int b=40;
int d=30;
public void m2()
{
System.out.println("m2 of class B");
}
public void m3()
{
System.out.println("m3 of class B");
}
}

class C extends B
{
int a=90;
public void m3()
{
System.out.println("m3 of class C");
}
public void m5()
{
System.out.println("m5 of class C");
}
}

class D extends B
{
int a=50;
int c=60;
public void m1()
{
System.out.println("m1 of class D");
}
public void m3()
{
System.out.println("m3 of class D");
}
}

class E extends C
{
int d=11;
int a=12;
public void m2()
{
System.out.println("m2 of class E");
}
public void m5()
{
System.out.println("m5 of class E");
}
}

class F extends D
{
int b=70;
int d=80;
public void m2()
{
System.out.println("m2 of class F");
}
}

class Test1
{
public static void main(String[] args)
{
A a=new A();
a.m1();
a.m2();
System.out.println(a.a);
System.out.println(a.b);

B b=new B();
b.m1();
b.m2();
b.m3();
System.out.println(b.a);
System.out.println(b.b);
System.out.println(b.d);

C c=new C();
c.m1();
c.m3();
c.m5();
c.m2();
System.out.println(c.a);
System.out.println(c.b);
System.out.println(c.d);

D d=new D();
d.m1();
d.m2();
d.m3();
System.out.println(d.a);
System.out.println(d.b);
System.out.println(d.c);
System.out.println(d.d);

E e=new E();
e.m1();
e.m2();
e.m3();
e.m5();
System.out.println(e.a);
System.out.println(e.b);
System.out.println(e.d);

F f=new F();
f.m1();
f.m2();
f.m3();
System.out.println(f.a);
System.out.println(f.b);
System.out.println(f.c);
System.out.println(f.d);

A a1=new B();
a1.m1();
a1.m2();
System.out.println(a1.b);
System.out.println(a1.a);

A a2=new C();
a2.m1();
a2.m2();
System.out.println(a2.a);
System.out.println(a2.b);

A a3=new D();
a3.m1();
a3.m2();
System.out.println(a3.a);
System.out.println(a3.b);

A a4=new E();
a4.m2();
a4.m1();
System.out.println(a4.a);
System.out.println(a4.b);

A a5=new F();
a5.m1();
a5.m2();
System.out.println(a5.b);
System.out.println(a5.a);

B b1=new C();
b1.m2();
b1.m3();
b1.m1();
System.out.println(b1.d);
System.out.println(b1.b);
System.out.println(b1.a);

B b2=new D();
b2.m2();
b2.m3();
b2.m1();
System.out.println(b2.a);
System.out.println(b2.b);
System.out.println(b2.d);

B b3=new E();
b3.m1();
b3.m2();
b3.m3();
System.out.println(b3.a);
System.out.println(b3.b);
System.out.println(b3.d);

B b4=new F();
b4.m1();
b4.m2();
b4.m3();
System.out.println(b4.a);
System.out.println(b4.b);
System.out.println(b4.d);

C c1=new E();
c1.m1();
c1.m2();
c1.m3();
c1.m5();
System.out.println(c1.a);
System.out.println(c1.b);
System.out.println(c1.d);

D d1=new F();
d1.m1();
d1.m2();
d1.m3();
System.out.println(d1.a);
System.out.println(d1.b);
System.out.println(d1.c);
System.out.println(d1.d);

}
}
