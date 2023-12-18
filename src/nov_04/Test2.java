class A
{
int a=10;
Integer b=null;
char d='A';
public void m1()
{
System.out.println("m1 method of A");
}
public void m3()
{
System.out.println("m3 method of A");
}
public void m5()
{
System.out.println("m5 method of A");
}
}


class B extends A
{
int b=50;
int c=10;
String d="PQR";
public void m2()
{
System.out.println("m2 method of B");
}
public void m4()
{
System.out.println("m4 method of B");
}
public void m6()
{
System.out.println("m6 method of B");
}
}


class C extends A
{
boolean b=false;
String c="ABC";
float e=20.50f;
public void m2()
{
System.out.println("m2 method of C");
}
public void m3()
{
System.out.println("m3 method of C");
}
public void m4()
{
System.out.println("m4 method of C");
}
}

class D extends B
{
boolean a=true;
String b="xyz";
float c=20f;
public void m1()
{
System.out.println("m1 method of D");
}
public void m3()
{
System.out.println("m3 method of D");
}
public void m5()
{
System.out.println("m5 method of D");
}
public void m6()
{
System.out.println("m6 method of D");
}
}

class E extends C
{
boolean a=true;
int b=20;
char d='e';
String e="Atharva";
public void m1()
{
System.out.println("m1 method of E");
}
public void m4()
{
System.out.println("m4 method of E");
}
public void m6()
{
System.out.println("m6 method of E");
}
public void m7()
{
System.out.println("m7 method of E");
}
}

class F extends D
{
String f="MNO";
public void m2()
{
System.out.println("m2 method of F");
}
public void m5()
{
System.out.println("m5 method of F");
}
public void m7()
{
System.out.println("m7 method of F");
}
}

class G extends D
{
double c=20.50;
char d='c';
public void m2()
{
System.out.println("m2 method of G");
}
public void m3()
{
System.out.println("m3 method of G");
}
public void m5()
{
System.out.println("m5 method of G");
}
public void m7()
{
System.out.println("m7 method of G");
}
}


class H extends E
{
String b="null";
int c=50;
String f="xyz";
public void m2()
{
System.out.println("m2 method of H");
}
public void m3()
{
System.out.println("m3 method of H");
}
public void m4()
{
System.out.println("m4 method of H");
}
public void m5()
{
System.out.println("m5 method of H");
}
}


class Test2
{
public static void main(String[] args)
{
A a=new A();
a.m1();
a.m3();
a.m5();
System.out.println(a.a);
System.out.println(a.b);
System.out.println(a.d);

B b=new B();
b.m1();
b.m2();
b.m3();
b.m4();
b.m5();
b.m6();
System.out.println(b.a);
System.out.println(b.b);
System.out.println(b.c);
System.out.println(b.d);

C c=new C();
c.m1();
c.m2();
c.m3();
c.m4();
c.m5();
System.out.println(c.a);
System.out.println(c.b);
System.out.println(c.c);
System.out.println(c.d);
System.out.println(c.e);

D d=new D();
d.m1();
d.m2();
d.m3();
d.m4();
d.m5();
d.m6();
System.out.println(d.a);
System.out.println(d.b);
System.out.println(d.c);
System.out.println(d.d);

E e=new E();
e.m1();
e.m2();
e.m3();
e.m4();
e.m5();
e.m6();
e.m7();
System.out.println(e.a);
System.out.println(e.b);
System.out.println(e.c);
System.out.println(e.d);
System.out.println(e.e);

F f=new F();
f.m1();
f.m2();
f.m3();
f.m4();
f.m5();
f.m6();
f.m7();
System.out.println(f.a);
System.out.println(f.b);
System.out.println(f.c);
System.out.println(f.d);
System.out.println(f.f);

G g=new G();
g.m1();
g.m2();
g.m3();
g.m4();
g.m5();
g.m6();
g.m7();
System.out.println(g.a);
System.out.println(g.b);
System.out.println(g.c);
System.out.println(g.d);

H h=new H();
h.m1();
h.m2();
h.m3();
h.m4();
h.m5();
h.m6();
h.m7();
System.out.println(h.a);
System.out.println(h.b);
System.out.println(h.c);
System.out.println(h.d);
System.out.println(h.e);
System.out.println(h.f);

A a1=new B();
a1.m1();
a1.m3();
a1.m5();
System.out.println(a1.a);
System.out.println(a1.b);
System.out.println(a1.d);

A a2=new C();
a2.m1();
a2.m3();
a2.m5();
System.out.println(a2.a);
System.out.println(a2.b);
System.out.println(a2.d);

A a3=new D();
a3.m1();
a3.m3();
a3.m5();
System.out.println(a3.a);
System.out.println(a3.b);
System.out.println(a3.d);

A a4=new E();
a4.m1();
a4.m3();
a4.m5();
System.out.println(a4.a);
System.out.println(a4.b);
System.out.println(a4.d);

A a5=new F();
a5.m1();
a5.m3();
a5.m5();
System.out.println(a5.a);
System.out.println(a5.b);
System.out.println(a5.d);

A a6=new G();
a6.m1();
a6.m3();
a6.m5();
System.out.println(a6.a);
System.out.println(a6.b);
System.out.println(a6.d);

A a7=new H();
a7.m1();
a7.m3();
a7.m5();
System.out.println(a7.a);
System.out.println(a7.b);
System.out.println(a7.d);

B b1=new D();
b1.m1();
b1.m2();
b1.m3();
b1.m4();
b1.m5();
b1.m6();
System.out.println(b1.a);
System.out.println(b1.b);
System.out.println(b1.c);
System.out.println(b1.d);

B b2=new F();
b2.m1();
b2.m2();
b2.m3();
b2.m4();
b2.m5();
b2.m6();
System.out.println(b2.a);
System.out.println(b2.b);
System.out.println(b2.c);
System.out.println(b2.d);

B b3=new G();
b3.m1();
b3.m2();
b3.m3();
b3.m4();
b3.m5();
b3.m6();
System.out.println(b3.a);
System.out.println(b3.b);
System.out.println(b3.c);
System.out.println(b3.d);

C c1=new E();
c1.m1();
c1.m2();
c1.m3();
c1.m4();
c1.m5();
System.out.println(c1.a);
System.out.println(c1.b);
System.out.println(c1.c);
System.out.println(c1.d);
System.out.println(c1.e);

C c2=new H();
c2.m1();
c2.m2();
c2.m3();
c2.m4();
c2.m5();
System.out.println(c2.a);
System.out.println(c2.b);
System.out.println(c2.c);
System.out.println(c2.d);
System.out.println(c2.e);

D d1=new F();
d1.m1();
d1.m2();
d1.m3();
d1.m4();
d1.m5();
d1.m6();
System.out.println(d1.a);
System.out.println(d1.b);
System.out.println(d1.c);
System.out.println(d1.d);

D d2=new G();
d2.m1();
d2.m2();
d2.m3();
d2.m4();
d2.m5();
d2.m6();
System.out.println(d2.a);
System.out.println(d2.b);
System.out.println(d2.c);
System.out.println(d2.d);

E e1=new H();
e1.m1();
e1.m2();
e1.m3();
e1.m4();
e1.m5();
e1.m6();
e1.m7();
System.out.println(e1.a);
System.out.println(e1.b);
System.out.println(e1.c);
System.out.println(e1.d);
System.out.println(e1.e);
}
}