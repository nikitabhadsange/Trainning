class Company
{
int id;
String name;
}

class Employee
{
int eid;
String ename;
Company com;
}

public class Test1
{
public static void main(String[] args)
{
Company c=new Company();
c.id=1;
c.name="TCs";

Employee e=new Employee();
e.eid=101;
e.ename="Nikita";
e.com=c;

System.out.println(e.eid);
System.out.println(e.ename);
System.out.println(e.com.id);
System.out.println(e.com.name);
}
}