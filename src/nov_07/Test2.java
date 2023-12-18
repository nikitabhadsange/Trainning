class A
{
public String m1()
{
return "abc";
}
public Object m2()
{
return "XYZ";
}
}

class Test2
{
public static void main(String[] args)
{
A a=new A();
String val=a.m1();
String val1=(String) a.m2();
System.out.println(val);
System.out.println(val1);
}
}