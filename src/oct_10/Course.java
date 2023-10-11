public class Course
{
public void details()
{
String className="CJC";
String courseName="Java Full Stack";
int courseFees=80000;

System.out.println("Class name:" +className);
System.out.println("Course name:" +courseName);
System.out.println("Course Fees:" +courseFees);
}

public static void main(String args[])
{
Course c=new Course();
c.details();
}
}