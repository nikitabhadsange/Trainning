public class Test1
{
public static void main(String[] args)
{
Employee e=new Employee();
e.setId(1);
e.setName("abc");
e.setSalary(965.0f);
System.out.println(e.getId());
System.out.println(e.getName());
System.out.println(e.getSalary());

Employee e1=new Employee();
e1.setId(2);
e1.setName("pqr");
e1.setSalary(856.0f);
System.out.println(e1.getId());
System.out.println(e1.getName());
System.out.println(e1.getSalary());

}
}