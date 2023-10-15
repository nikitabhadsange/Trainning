import java.util.Scanner;
public class School
{

public void information()
{
Scanner scan=new Scanner(System.in);
System.out.println("School name");
String s=scan.next();
System.out.println(s);

System.out.println("School hours");
int i=scan.nextInt();
System.out.println(i);

}

public static void main(String args[])
{
School s=new School();
s.information();
}
}