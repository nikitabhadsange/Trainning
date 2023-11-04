public class Test1
{
public static void main(String[] args)
{

B1 b1=new B1();
b1.display();
}

}

class A1
{
public void mul()
{
int a=5;
int b=4;
int c=a*b;
System.out.println(c);
}
}
class B1 extends A1 
{
public void display()
{

mul();

}
}