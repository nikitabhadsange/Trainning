class Student
{
private int rollno;
public int getRollno()
{
return rollno;
}
}

public class Test
{
public static void main(String[] args)
{
Student s=new Student();
int x=s.getRollno();
System.out.println(x);
}
}