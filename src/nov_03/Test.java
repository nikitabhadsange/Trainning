
class A
{
public void add()
{
int a=10;
int b=20;
int c=a+b;
System.out.println(c);
}
}

class B extends A
{
public void sub()
{
int a=20;
int b=10;
int c=a-b;
System.out.println(c);
}
}

class Test
{
public static void main(String[] args)
{
B b1=new B();
b1.add();
b1.sub();
}

}