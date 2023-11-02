import java.util.Scanner;
public class Information

{
Scanner scan=new Scanner(System.in);
public Customer m1()
{
Customer c=new Customer();

Address a=new Address();
System.out.println("Enter cityname" );
a.setCityname(scan.next());
System.out.println("Enter areaname" );
a.setAreaname(scan.next());
System.out.println("Enter pincode" );
a.setPincode(scan.nextInt());

System.out.println("Enter id");
c.setId(scan.nextInt());
System.out.println("Enter name");
c.setName(scan.next());
c.setAddress(a);
return c;
}


public void m2(Customer c1)
{
System.out.println(c1.getId());
System.out.println(c1.getName());
System.out.println(c1.getAddress().getCityname());
System.out.println(c1.getAddress().getAreaname());
System.out.println(c1.getAddress().getPincode());
}
}