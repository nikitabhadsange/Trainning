class A
{

}
class B extends A
{
int x;
}

class Test3
{
public A m1()
{
B b=new B();
b.x=100;
return b;
}
public static void main(String[] args)
{
Test3 t=new Test3();
B b=(B) t.m1();
System.out.println(b.x);
}

}