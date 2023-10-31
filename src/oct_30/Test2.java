class Student
{
private int rollno;
private String name;
public int getRollno()
{
return rollno;
}
public void setRollno(int rollno)
{
this.rollno=rollno;
}
public String getName()
{
return name;
}
public void setName(String name)
{
this.name=name;
}
}

public class Test2
{
public void display(Student s)
{
System.out.println(s.getRollno());

}
}