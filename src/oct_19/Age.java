import java.util.Scanner;
public class Age
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter age");
int age=scan.nextInt();

if(age>=0&&age<=18)
{
System.out.println("Child");
}
else if(age>=18&&age<=40)
{
System.out.println("Young");
}
else if(age>40&&age<=100)
{
System.out.println("old");
}
else if(age>=100)
{
System.out.println("too old");
}

}


}