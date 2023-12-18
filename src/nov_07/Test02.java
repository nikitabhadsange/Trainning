class A
{

}
class B 
{

}
class C extends A
{

}
class D extends B
{

}
class E extends C
{

}





class Test02
{
public A m1()
{
A a=new A();
B b=new B();
C c=new C();
D d=new D();
E e=new E();
//return a;
//return c;
return e;
}

public B m2()
{
A a=new A();
B b=new B();
C c=new C();
D d=new D();
E e=new E();
//return b;
return d;
}

public C m3()
{
A a=new A();
B b=new B();
C c=new C();
D d=new D();
E e=new E();
//return c;
return e;
}

public D m4()
{
A a=new A();
B b=new B();
C c=new C();
D d=new D();
E e=new E();
return d;
}

public E m5()
{
A a=new A();
B b=new B();
C c=new C();
D d=new D();
E e=new E();
return e;

}

public static void main(String[] args)
{

}
}
