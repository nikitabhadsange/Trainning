public class Calculator1
{
public void add()
{
System.out.println("Add method call");
}

public void sub()
{
System.out.println("Sub method call");
}

public void mul()
{
System.out.println("Mul method call");
}

public void div()
{
System.out.println("Div method call");
}

public static void main(String args[])
{
Calculator1 c1 = new Calculator1();

c1.add();
c1.sub();
c1.mul();
c1.div();
}
}