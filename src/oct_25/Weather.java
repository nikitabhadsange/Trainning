import java.util.Scanner;
public class Weather
{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter range");
int range=scan.nextInt();
System.out.println("Its too cold");

if(range>=-10&&range<=5)
{

	if(range==-10)
	{
		System.out.println("This is cold country");
	}
	else if(range==0)
	{
		System.out.println("This is greenland country");
	}

	else if(range==5)
	{
		System.out.println("This is USA");
	}
	else
	{
		System.out.println("Country not found");
	}
}

else if(range>=5&&range<=35)
{
	if(range==5)
	{
		System.out.println("This is pleasant country");
	}
	else if(range==20)
	{
		System.out.println("this is Russia");
	}
	else if(range<=35)
	{
		System.out.println("This is netherland ");
	}
	
	else
	{
		System.out.println("Country not found");
	}
}

else if(range>=35&&range<=60)
{
	if(range==35)
	{
		System.out.println("This is India");
	}
	else if(range<=35)
	{
		System.out.println("This is Dubai");
	}
	else if(range<=60)
	{
		System.out.println("This is Africa");
	}
	else
	{
		System.out.println("Country not found");
	}
}


}
}
