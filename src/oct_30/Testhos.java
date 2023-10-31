import java.util.Scanner;
public class Testhos
{
Scanner scan=new Scanner(System.in);
public Hospital setInfo()
{
Hospital h=new Hospital();
System.out.println("Enter id");
h.setId(scan.nextInt());

System.out.println("Enter name");
h.setName(scan.next());

System.out.println("Enter address");
h.setAddress(scan.next());

System.out.println("Enter  phone number");
h.setPhoneno(scan.nextLong());
return h;
}

public void getInfo()
{
Hospital h1=setInfo();
System.out.println(h1.getId());
System.out.println(h1.getName());
System.out.println(h1.getPhoneno());
System.out.println(h1.getAddress());
}

public static void main(String[] args)
{
Testhos t1=new Testhos();

t1.getInfo();
}

}