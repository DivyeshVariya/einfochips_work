
public class FourWheeler extends Vehicle{
	public FourWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		// TODO Auto-generated constructor stub
	}
	private String audioSystem;
	private int numberOfDoors;
	
	public void setAudioSystem(String AudioSystem)
	{
		audioSystem=AudioSystem;
	}
	public String getAudioSystem()
	{
		return audioSystem;
	}
	public void setNumberOfDoors(int NumberOfDoors)
	{
		numberOfDoors=NumberOfDoors;
	}
	public int getNumberOfDoors()
	{
		return numberOfDoors;
	}
	public void displayDetailInfo()
	{
		super.displayMake();
		super.displayBasicInfo();
		System.out.println("\n\t.... Detail Information .... ");
		System.out.println("Audio System: "+ getAudioSystem());
		System.out.println("Number of Doors :" + getNumberOfDoors());
	}
}
