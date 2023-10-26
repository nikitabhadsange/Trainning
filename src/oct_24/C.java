//If class have any type of constructor then compiler does not put any other constructor

public class C
{
public C()
{
System.out.println("C constructor");
}

public static void main(String[] args)
{
C c=new C();
}
}