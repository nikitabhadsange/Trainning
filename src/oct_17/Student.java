package warje;
import java.util.Scanner;
import karvenagar.College;
public class Student
{
Scanner scan=new Scanner(System.in);
public void stuInfo(int no, String sname)
{

College c=new College();

System.out.println("Enter cname");
String cname=scan.next();

System.out.println("Enter id");
int id=scan.nextInt();


System.out.println("Enter address");
String address=scan.next();

c.clgInfo(cname,id,address);

System.out.println("no" +no);
System.out.println("sname" +sname);
}
}

