public class Calculator1
{
public void add()
{
int a=100;
int b=120;
System.out.println("Sum is:" +(a+b));
}

public void sub()
{
int a=200;
int b=50;
System.out.println("Substraction is:" +(a-b));
}

public void mul()
{
int a=20;
int b=50;
System.out.println("Product is:" +(a*b));
}

public void div()
{
int a=200;
int b=50;
System.out.println("Division is:" +(a/b));
}

public static void main(String args[])
{
Calculator1 c = new Calculator1();
c.add();
c.sub();
c.mul();
c.div();
}
}