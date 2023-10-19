package com.cjc.dev.company;
import java.util.Scanner;
import com.cjc.dev.trainee.Trainee;
import com.cjc.dev.teamlead.Teamlead;
import com.cjc.dev.manager.Manager;
import com.cjc.dev.seniormanager.Seniormanager;
import com.cjc.dev.director.Director;
public class Company
{
public static void main(String [] args)
{
Scanner scan=new Scanner(System.in);

System.out.println("Enter your choice:");
int choice=scan.nextInt();

if(choice==1)
{
Trainee t1=new Trainee();
t1.traineeInfo();
}
else if(choice==2)
{
Teamlead t2=new Teamlead();
t2.teamleadInfo();
}
else if(choice==3)
{
Manager m=new Manager();
m.managerInfo();
}
else if(choice==4)
{
Seniormanager sm=new Seniormanager();
sm.seniormanagerInfo();
}
else if(choice==5)
{
Director d=new Director();
d.directorInfo();
}
else
{
System.out.println("Invalid choice");
}
}
}
