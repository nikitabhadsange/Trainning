public class Calculator
{

public void add()
{
System.out.println(10+30);
}

public void sub(int a,int b)
{
System.out.println(a-b);
}

public int mul()
{
System.out.println(5*5);
return 0;
}

public int div(int a,int b)
{
System.out.println(a/b);

return 0;
}

public static void main(String args[])
{
Calculator c=new Calculator();
c.add();
c.sub(20,10);
System.out.println(c.mul());
System.out.println(c.div(100,10));
}
}