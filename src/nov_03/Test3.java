class Parent
{
int x=30;
int y=20;
void m1()
{
System.out.println("m1 method of parent class");
}
void m2()
{
System.out.println("m2 method of parent class");
}
void m3()
{
System.out.println("m3 method of parent class");
}
}

class Child extends Parent
{
void m4()
{
System.out.println("m4 method of parent class");
System.out.println(x);
System.out.println(y);
}
void m5()
{

m1();
m2();
m3();
m4();
System.out.println("m5 method of parent class");

}
}


class Test3{
public static void main(String[] args)
{
Child c=new Child();
c.m4();
c.m5();
}
}