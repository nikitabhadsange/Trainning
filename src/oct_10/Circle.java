public class Circle
{
public void area()
{
float d = 10f;
float pi = 3.14f;
float area = 2*pi*d;
System.out.println("Area of circle is: " +area);
}
public static void main(String args[])
{
Circle c = new Circle();
c.area();
}
}