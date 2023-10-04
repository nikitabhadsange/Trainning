public class Calculator
{
public int add(int a,int b)
{
int c = a+b;
return c;
}

public long sub(long a,long b)
{
long c = a-b;
return c;
}

public double mul(double a,double b)
{
double c = a*b;
return c;
}

public float div(float a,float b)
{
float c = a/b;
return c;
}

public static void main(String args[])
{
Calculator c1 = new Calculator();
//c1.add(10,20);
System.out.println(c1.add(10,20));
System.out.println(c1.sub(30,20));
System.out.println(c1.mul(5,5));
System.out.println(c1.div(100f,10f));
}
}







