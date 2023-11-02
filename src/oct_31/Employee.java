public class Employee
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