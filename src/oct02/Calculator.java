public class Calculator
{
public void add(int a, int b)
{
int c = a+b;
System.out.println(c);
}

public void sub(long a, long b)
{
   c = b-a;
System.out.println(c);
}

public void mul(double a, double b)
{
double c = a*b;
System.out.println(c);
}

public void div(float a, float b)
{
float c = b/a;
System.out.println(c);
}

public static void main(String args[])
{
Calculator a = new Calculator();
a.add(10,20);
a.sub(30,10);
a.mul(5.2,5.4);
a.div(100.10f,5.5f);

}
}