import java.util.Scanner;
public class Shape
{
public static void main(String [] args)
{
Scanner scan=new Scanner(System.in);

System.out.println("Choice is\n" +"1.Rectangle\n" +"2.Square\n" +"3.Triangle\n" +"4.Circle\n");

System.out.println("Enter choice");
int choice=scan.nextInt();

if(choice==1)
{
Rectangle r=new Rectangle();
r.area();
r.perimeter();
}
else if(choice==2)
{
Square s=new Square();
s.area();
s.perimeter();
} 
else if(choice==3)
{
Triangle t=new Triangle();
t.perimeter();
}
else if(choice==4)
{
Circle c=new Circle();
c.area();
}
}
}