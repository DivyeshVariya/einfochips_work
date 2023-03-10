import java.util.Scanner;

public class Main {
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		int choice=0;
		String make;
		String vehicleNumber;
		String fuelType;
		int fuelCapacity;
		int cc;
		String kick;
		while(true)
		{
			System.out.println("\n\t... Type of Vehicle ...\n"
					+ "1.Four Wheeler"
					+ "\r\n"
					+ "2.Two Wheeler");
			System.out.println("Enter your choise : ");
			choice=scan.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter Vehicle Make: ");
				make=scan.next();
				System.out.println("Enter Vehicle Number: ");
				vehicleNumber=scan.next();
				System.out.println("Fuel Type:\r\n"
						+ "1.Petrol\n"
						+ "2.Diesel");
				System.out.println("Enter your choice :");
				choice=scan.nextInt();
				if(choice==1)
				{
					fuelType="Petrol";
				}
				else
				{
					fuelType="Diesel";
				}
				System.out.println("Enter Fuel Capacity: ");
				fuelCapacity=scan.nextInt();
				System.out.println("Enter Engine CC: ");
				cc=scan.nextInt();
				FourWheeler fw= new FourWheeler(make,vehicleNumber,fuelType,fuelCapacity,cc);
				System.out.println("Enter Audio System: ");
				fw.setAudioSystem(scan.next());
				System.out.println("Enter Number of Doors: ");
				fw.setNumberOfDoors(scan.nextInt());
				fw.displayDetailInfo();
				System.exit(0);
				break;
			case 2:
				System.out.println("Enter Vehicle Make: ");
				make=scan.next();
				System.out.println("Enter Vehicle Number: ");
				vehicleNumber=scan.next();
				System.out.println("Fuel Type:\r\n"
						+ "1.Petrol\r"
						+ "\r\n"
						+ "2.Diesel");
				System.out.println("Enter your choice :");
				choice=scan.nextInt();
				if(choice==1)
				{
					fuelType="Petrol";
				}
				else
				{
					fuelType="Diesel";
				}
				System.out.println("Enter Fuel Capacity: ");
				fuelCapacity=scan.nextInt();
				System.out.println("Enter Engine CC: ");
				cc=scan.nextInt();
				TwoWheeler tw= new TwoWheeler(make,vehicleNumber,fuelType,fuelCapacity,cc);
				System.out.println("Enter Kick Start Available(yes/no): ");
				kick=scan.next();
				if(kick.equals("yes"))
				{
				tw.setkickStartAvailable(true);
				}
				else
				{
				tw.setkickStartAvailable(true);
				}
				tw.displayDetailInfo();
				System.exit(0);
				break;
			default:
				System.out.println("Invaild Input...");
				System.exit(0);
				break;
			}
		}
	}
}
