// We can write multiple constructor in single class

public class E
{
public E()
{
System.out.println("Non parameterized Constructor");
}

public E(int x)
{
System.out.println("parameterized constructor");
x=10;
}
public static void main(String[] args)
{
E e=new E();
E e1=new E(10);


}
}