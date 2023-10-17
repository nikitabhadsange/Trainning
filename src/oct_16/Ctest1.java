package calculatortest;
import java.util.Scanner;
public class Ctest1
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
Calculator1 c=new Calculator1();
System.out.println("Enter two no");
c.add(scan.nextInt(),scan.nextInt());

System.out.println("Enter two no");
c.add(scan.nextInt(),scan.nextInt());

System.out.println("Enter two no");
c.sub(scan.nextInt(),scan.nextInt());

System.out.println("Enter two no");
c.mul(scan.nextInt(),scan.nextInt());

}
}
