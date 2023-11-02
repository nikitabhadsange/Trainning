import java.util.Scanner;
public class Test01
{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
Company c=new Company();
System.out.println("Enter company id");
c.setId(scan.nextInt());
System.out.println("Enter company name");
c.setName(scan.next());

Employee e=new Employee();
System.out.println("Enter Employee id");
e.setEid(scan.nextInt());
System.out.println("Enter Employee name");
e.setEname(scan.next());
e.setCompany(c);

System.out.println(e.getEid());
System.out.println(e.getEname());
System.out.println(e.getCompany().getId());
System.out.println(e.getCompany().getName());

}
}



class Company
{
private int id;
private String name;
public void setId(int id)
{
this.id=id;
}
public int getId()
{
return id;
}
public void setName(String name)
{
this.name=name;
}
public String getName()
{
return name;
}
}

class Employee
{
private int eid;
private String ename;
Company com;

public void setEid(int eid)
{
this.eid=eid;
}
public int getEid()
{
return eid;
}
public void setEname(String ename)
{
this.ename=ename;
}
public String getEname()
{
return ename;
}
public void setCompany(Company com)
{
this.com=com;
}
public Company getCompany()
{
return com;
}
}

