import java.util.Scanner;
public class Program05
{

public static void main(String args[])
{



Scanner scan=new Scanner(System.in);
System.out.println("First marks");
int i=scan.nextInt();
System.out.println(i);

System.out.println("Second marks");
int j=scan.nextInt();
System.out.println(j);

System.out.println("Third marks");
int k=scan.nextInt();
System.out.println(k);

System.out.println(i+j+k);
System.out.println((i+j+k)/3);


}
}