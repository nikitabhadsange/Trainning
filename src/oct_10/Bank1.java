public class Bank1
{
long accNo=1234567;
String name="Elon Musk";
int age=21;
String city="Pune";
float bal=1000.67f;

public void viewDetails()
{
System.out.println("Account No:" +accNo);
System.out.println("Account Holder Name:" +name);
System.out.println("Customer age:" +age);
System.out.println("Customer City:" +city);
System.out.println("Account Balance:" +bal);
}

public void deposit()
{
float depositAmt=1000.00f;
bal=bal+depositAmt;
System.out.println("Amount deposited");
System.out.println("Current balance:" +bal);
}

public void withdraw()
{
float withdrawAmt=500.00f;
bal=bal-withdrawAmt;
System.out.println("Amount withdraw");
System.out.println("Current balance:" +bal);
}

public static void main(String args[])
{
Bank1 b1 = new Bank1();
b1.viewDetails();
b1.deposit();
b1.withdraw();
}
}