public class Student
{
public double sdetails(int sId, String sName, float sMarks)
{
System.out.println(sId);
System.out.println(sName);
System.out.println(sMarks);

return 0;
}
public static void main(String args[])
{
Student s1 = new Student();
System.out.println(s1.sdetails(001,"Nikita",85f));

}
}