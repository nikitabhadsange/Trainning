public class Calculator2
{
public void add()
{
System.out.println(10+10);
}

public void sub()
{
System.out.println(20-10);
}

public void mul()
{
System.out.println(5*5);
}

public void div()
{
System.out.println(100/10);
}

public static void main(String args[])
{
Calculator2 c2 = new Calculator2();

c2.add();
c2.sub();
c2.mul();
c2.div();
}
}