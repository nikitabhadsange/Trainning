public class Test
{
public static void main(String[] args)
{
Company c=new Company();
c.setId(1);
c.setName("Wipro");

Employee e=new Employee();
e.setEid(101);
e.setEname("abc");
e.setCompany(c);

System.out.println(e.getEid());
System.out.println(e.getEname());
System.out.println(e.getCompany().getId());
System.out.println(e.getCompany().getName());
}
}