class A
{

}
class B extends A
{

}
class C extends B
{

}
class Test1
{
public A m1()
{
A a=new A();
B b=new B();
C c=new C();
return a;
//return b;
//return c;
}
public B m2()
{
A a=new A();
B b=new B();
C c=new C();

return b;
//return c;
}
public C m3()
{
A a=new A();
B b=new B();
C c=new C();
return c;
}
}


class Test
{
public static void main(String[] args)
{
Test1 t=new Test1();
}
}