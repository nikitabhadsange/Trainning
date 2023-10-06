public class Bank
{
public void createAccount()
{
System.out.println("Account created successfully");
}

public void deposit()
{
System.out.println("Amount depoeited successfully");
}

public void withdraw()
{
System.out.println("Amount withdraw successfully");
}

public void checkBalance()
{
System.out.println("Balance checked successfully");
}

public static void main(String args[])
{
Bank b = new Bank();
b.createAccount();
b.deposit();
b.withdraw();
b.checkBalance();
}
}

