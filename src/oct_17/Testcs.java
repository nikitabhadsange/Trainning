package akurdi;
import karvenagar.College;
import warje.Student;
import java.util.Scanner;

public class Testcs
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
Student s=new Student();

System.out.println("Enter no");
int no=scan.nextInt();

System.out.println("Enter name");
String sname=scan.next();


s.stuInfo(no,sname);
}
}