import java.util.Scanner;

 class Employee
{
int id;
String name;

public void setId(int id ){this.id=id;}
public void setName(String name ){this.name=name;}

public int getId(){return id;}
public String getName(){return name;}
}

class Developer extends Employee
{
int noofdeveloper;

public void setNoofdeveloper(int noofdeveloper )
{
this.noofdeveloper=noofdeveloper;
}

public int getNoofdeveloper()
{
return noofdeveloper;
}

}

class Tester extends Employee
{
int nooftester;

public void setNooftester(int nooftester )
{
this.nooftester=nooftester;
}

public int getNooftester()
{
return nooftester;
}

}


class Test00
{
Scanner sc=new Scanner(System.in);
public Employee setDeveloper()
{
Developer d1=new Developer();
System.out.println("Enter employee id");
d1.setId(sc.nextInt());
System.out.println("Enter employee name");
d1.setName(sc.next());
System.out.println("Enter developer no");
d1.setNoofdeveloper(sc.nextInt());
return d1;
}

public Employee setTester()
{
Tester ts1=new Tester();
System.out.println("Enter employee id");
ts1.setId(sc.nextInt());
System.out.println("Enter employee name");
ts1.setName(sc.next());
System.out.println("Enter tester no");
ts1.setNooftester(sc.nextInt());
return ts1;
}

public static void main(String [] args)
{
Test00 t=new Test00();
//Employee e1=t.setDeveloper();
//Employee e2=t.setTester();
Developer d=(Developer)t.setDeveloper();

System.out.println("Employee id:-"+d.getId());
System.out.println("Employee name:-"+d.getName());
System.out.println("developer num:-"+d.getNoofdeveloper());

Tester ts1=(Tester)t.setTester();

System.out.println("Employee id:-"+ts1.getId());
System.out.println("Employee name:-"+ts1.getName());
System.out.println("tester num:-"+ts1.getNooftester());

}
}