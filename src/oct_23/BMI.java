import java.util.Scanner;
public class BMI
{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);

System.out.println("Enter height ");
int height=scan.nextInt();

System.out.println("Enter weight");
int weight=scan.nextInt();

int h=height/100;
System.out.println("Height is" +(height/100));
int bmi=weight/h*h;
System.out.println("BMI is" +(weight/h*h));
if(bmi<=18||bmi==18)
{
System.out.println("Under weight");
}
else if(bmi>=18||bmi<=25)
{
System.out.println("Healthy");
}
else if(bmi>=25||bmi<=30)
{
System.out.println("Over weight");
}
else if(bmi>=30)
{
System.out.println("Oversity");
}
else
{
System.out.println("Invalid input");
}
}
}