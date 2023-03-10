/*
 * Create a class Vehicle

Include the following protected data members / attributes:

make – of type String vehicleNumber – of type String

fuelType – of type String

fuelCapacity - of type Integer

cc – of type Integer

Include the following public methods

Create a constructor that initializes all the data members --- public Vehicle(String make,StringvehicleNumber,StringfuelType,IntegerfuelCapacity,Integer cc)

displayMake – Display the make of the vehicle

"displayBasicInfo" – display basic information of the vehicle. "displayDetailInfo" – An empty method.

Create a class TwoWheeler that extends Vehicle

Include the following private attributes / data members:

kickStartAvailable – of type Boolean.

Include the following public methods

Include appropriate constructors.

"displayDetailInfo" – displays the availability of kick start.

Create a class FourWheeler that extends Vehicle

Include the following private attributes / data members:

audioSystem – of type String.

numberOfDoors – of type Integer.

Include the following public methods

Include appropriate constructors.

"displayDetailInfo" - displays the audio system and number of doors.

Include getter setters for all the classes. Create a main class to test the classes defined above.
 */

public class Vehicle {
	protected String make;
	protected String vehicleNumber;
	protected String fuelType;
	protected int fuelCapacity;
	protected int cc;
	
	public Vehicle(String make,String vehicleNumber,String fuelType,int fuelCapacity,int cc)
	{
		this.make=make;
		this.vehicleNumber=vehicleNumber;
		this.fuelType=fuelType;
		this.fuelCapacity=fuelCapacity;
		this.cc=cc;
	}
	public void displayMake() 
	{
		System.out.println("\n\t **** " +this.make+" *****");
	}
	public void displayBasicInfo() 
	{
		System.out.println("\n\t **** " +this.make+" *****");
		System.out.println("\n\t... Basic Information ...");
		System.out.println("Vehicle Number: "+ this.vehicleNumber);
		System.out.println("Fuel Capacity: "+ this.fuelCapacity);
		System.out.println("Fuel Type :" + this.fuelType);
		System.out.println("CC: "+ this.cc);
	}
	public void displayDetailInfo() 
	{
		
	}
}
