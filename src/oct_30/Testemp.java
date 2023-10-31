import java.util.Scanner;
public class Testemp
{
Scanner scan=new Scanner(System.in);

public Employee setData()
{
Employee e=new Employee();
System.out.println("Enter id");
e.setId(scan.nextInt());

System.out.println("Enter name");
e.setName(scan.next());

System.out.println("Enter salary");
e.setSalary(scan.nextInt());

System.out.println("Enter mobile no");
e.setMobno(scan.nextLong());

System.out.println("Enter address");
e.setAdd(scan.next());
return e;
}

public void getData(Employee emp)
{
System.out.println(emp.getId());
System.out.println(emp.getName());
System.out.println(emp.getSalary());
System.out.println(emp.getMobno());
System.out.println(emp.getAdd());
}

public static void main(String[] args)
{
Testemp t=new Testemp();
Employee e=t.setData();
t.getData(e);
}


}