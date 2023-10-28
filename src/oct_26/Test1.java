public class Test1
{
public static void main(String[] args)
{
Employee e1=new Employee(1,"abc",8763.0f);
Employee e2=new Employee(2,"stu",543.0f);

Employee e3=new Employee(3,"mno",3455.0f);

System.out.println(e1.id);
System.out.println(e1.name);
System.out.println(e1.salary);

System.out.println(e2.id);
System.out.println(e2.name);
System.out.println(e2.salary);

System.out.println(e3.id);
System.out.println(e3.name);
System.out.println(e3.salary);
}
}