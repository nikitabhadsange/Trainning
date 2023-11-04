class One
{
public void Cjc()
{
System.out.println("Cjc classes");
}
}

class Two extends One
{
public void cjcclasses()
{
Cjc();
System.out.println("CJC classes by Kunal Sir");
}
}


public class TestCjc1
{
public static void main(String[] args)
{
Two t=new Two();
t.cjcclasses();
}
}