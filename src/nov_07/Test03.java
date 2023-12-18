class Test03
{
public Object m1()
{
int x=10;
return x;
}

public static void main(String[] args)
{
Test03 t=new Test03();
int i=(int) t.m1();
System.out.println(i);
}
}