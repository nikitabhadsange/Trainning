import java.util.Scanner;
public class College
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter college name:");
String s=scan.next()+scan.nextLine(); 
System.out.println(s);

System.out.println("Enter City:");
String s1=scan.next();
System.out.println(s1);

System.out.println("Enter pin code:");
int i=scan.nextInt();
System.out.println(i);

System.out.println("Type");
String s2=scan.next();
System.out.println(s2);
}
}