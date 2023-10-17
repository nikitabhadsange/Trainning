import java.util.Scanner;
public class Program07
{
Scanner scan=new Scanner(System.in);
public void getTotal()
{
System.out.println("First no");
int i=scan.nextInt();
System.out.println(i);

System.out.println("Second no");
int j=scan.nextInt();
System.out.println(j);

System.out.println(i+j);
return 0;

}

public static void main(String args[])
{
Program07 p=new Program07();
p.getTotal();
}
}