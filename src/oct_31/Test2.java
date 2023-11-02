class Company
{
int id;
String name;
public Company(int id,String name)
{
this.id=id;
this.name=name;
}
}

class Employee
{
int eid;
String ename;
Company com;
public Employee(int eid, String ename, Company com)
{
this.eid=eid;
this.ename=ename;
this.com=com;
}
}

public class Test2
{
public static void main(String[] args)
{
Company c=new Company(1,"aaa");
Employee e=new Employee(2,"abc",c);

System.out.println(e.eid);
System.out.println(e.ename);
System.out.println(e.com.id);
System.out.println(e.com.name);
}
}