public class Student
{
private String name;
private double clgfees;
private float mark;
private char gender;
private Faculty faculty;

public void setName(String name)
{
this.name=name;
}
public String getName()
{
return name;
}
public void setClgfees(double clgfees)
{
this.clgfees=clgfees;
}
public double getClgfees()
{
return clgfees;
}
public void setMark(float mark)
{
this.mark=mark;
}
public float getMark()
{
return mark;
}
public void setGender(char gender)
{
this.gender=gender;
}
public char getGender()
{
return gender;
}
public void setFaculty(Faculty faculty)
{
this.faculty=faculty;
}
public Faculty getFaculty()
{
return faculty;
}

}