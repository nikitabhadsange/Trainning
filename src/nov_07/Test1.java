class A
{
public int m1()
{
return 10;
}
public Object m2()
{
return 20;
}
}

class Test1
{
public static void main(String[] args)
{
A a=new A();
int x=a.m1();
int y=(int) a.m2();
System.out.println(x);
System.out.println(y);
}
}