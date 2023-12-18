class M
{

}
class N extends M
{

}
class O extends M
{

}

public class A3
{
public M m1()
{
M m=new M();
N n=new N();
O o=new O();
return m;
//return n;
//return o;
}

public N m2()
{
M m=new M();
N n=new N();
O o=new O();
return n;
//return o;
}

public O m3()
{
M m=new M();
N n=new N();
O o=new O();
return o;
}

public static void main(String[] args)
{
A3 a=new A3();
a.m1();
a.m2();
a.m3();
}
}