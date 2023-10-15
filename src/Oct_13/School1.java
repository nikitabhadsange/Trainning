public class School1
{
public void information()
{
String schoolName="abcd";
int schoolHours=8;
int staffNo=50;

System.out.println("School name:" +schoolName);
System.out.println("School Hours:" +schoolHours);
System.out.println("Staff number:" +staffNo);
}

public static void main(String args[])
{
School1 s1=new School1();
s1.information();
}

}