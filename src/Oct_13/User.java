package com.college;

import com.department.Mechanical.Student;
import com.department.Mechanical.Teacher;
import com.department.Computer.Student1;
import com.department.Computer.Teacher1; 

public class User
{
public static void main(String args[])
{
Student s=new Student();
s.details();

Teacher t=new Teacher();
t.details();

Student1 s1=new Student1();
s1.details();

Teacher1 t1=new Teacher1();
t1.details();
}
}