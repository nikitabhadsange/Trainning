public class Rto
{
public void registerVehicle()
{
System.out.println("Vehicle is Registered");
}

public void deleteVehicle()
{
System.out.println("Vehicle deleted from our system");
}

public static void main(String args[])
{
Rto pune= new Rto();
pune.registerVehicle();
pune.deleteVehicle();
}
}