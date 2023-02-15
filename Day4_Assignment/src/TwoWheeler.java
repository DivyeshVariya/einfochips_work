
public class TwoWheeler extends Vehicle {
	
	public TwoWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		// TODO Auto-generated constructor stub
	}
	private boolean kickStartAvailable;
	public void setkickStartAvailable(boolean kickStartAvailable)
	{
		this.kickStartAvailable=kickStartAvailable;
	}
	public boolean getkickStartAvailable()
	{
		return kickStartAvailable;
	}
	public void displayDetailInfo()
	{
		super.displayMake();
		super.displayBasicInfo();
		System.out.println("\n\t.... Detail Information .... ");
		System.out.println("Kick Start Available :"+ this.getkickStartAvailable());
	}
}
