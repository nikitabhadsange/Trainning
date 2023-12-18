public class A2
{
public String m1()
{
return "CJC";
}

public Object m2()
{
return "Karvenagar";
}
public int m3()
{
return 10;
}

public double m4()
{
return 10d;
}

public byte m5()
{
return 25;
}

public static void main(String[] args)
{
A2 a=new A2();
String s=a.m1();
System.out.println(s);
String  o=(String)a.m2();
System.out.println(o);

double d=a.m4();
System.out.println(d);

Object o1=a.m2();
System.out.println(o1);
String s1=(String) a.m2();
System.out.println(s1);
String s2=(String) a.m2();
System.out.println(s2);


long l=a.m3();
System.out.println(l);
byte b=(byte)a.m3();
System.out.println(b);
short s3=(short) a.m3();
System.out.println(s3);


String s4=a.m1();
System.out.println(s4);

byte b1=a.m5();
System.out.println(b1);
int i=a.m5();
System.out.println(i);
}
}