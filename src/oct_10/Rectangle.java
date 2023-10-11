public class Rectangle
{
public void area()
{

float l= 5f;
float b= 4f;
float area = l*b;
System.out.println("Area of rectangle is:" +area); 
}

public static void main(String args[])
{
Rectangle r = new Rectangle();
r.area();
}
}