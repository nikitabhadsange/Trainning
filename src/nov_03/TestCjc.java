class Cjc
{
void batch()
{
int id=1;
String name="Nikita";
System.out.println(id);
System.out.println(name);
}
}


class Faculty extends Cjc
{
void data()
{
batch();
int id1=10;
String name1="Anjali";
System.out.println(id1);
System.out.println(name1);

}
}


class TestCjc
{
public static void main(String[] args)
{
Faculty f=new Faculty();
f.data();
}
}