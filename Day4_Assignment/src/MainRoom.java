import java.util.Scanner;

public class MainRoom {
	
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		String hotelName;
		int numberOfSqFeet;
		boolean hasTV;
		boolean hasWifi;
		int ratePerSqFeet;
		int choice;
		String temp;
		while(true)
		{
			System.out.println("\n\t .... Hotel Tariff Calculator ....\r\n"
					+ "\r\n"
					+ "1. Deluxe Room\r\n"
					+ "\r\n"
					+ "2. Deluxe AC Room\r\n"
					+ "\r\n"
					+ "3. Suite AC Room");
			System.out.println("Enter Your Choice :");
			choice=scan.nextInt();
			switch(choice)
			{ 
			case 1:
				System.out.println("Enter Hotel Name: ");
				hotelName=scan.next();
				System.out.println("Enter Room Square Feet Area: ");
				numberOfSqFeet=scan.nextInt();
				System.out.println("Enter Room has TV (yes/no): ");
				temp=scan.next();
				if(temp.equals("yes"))
				{
					hasTV=true;
				}
				else if(temp.equals("no"))
				{
					hasTV=false;
				}
				else
				{
					System.out.println("Invaild Input...");
					hasTV=false;
					System.exit(0);
				}
				System.out.println("Enter Room has Wifi (yes/no): ");
				temp=scan.next();
				if(temp.equals("yes"))
				{
					hasWifi=true;
				}
				else if(temp.equals("no"))
				{
					hasWifi=false;
				}
				else
				{
					System.out.println("Invaild Input...");
					hasWifi=false;
					System.exit(0);
				}
				DeluxeRoom dr= new DeluxeRoom(hotelName,numberOfSqFeet,hasTV,hasWifi);
				System.out.println("Room Tariff per day is: "+dr.calculateTariff(dr.numberOfSqFeet,dr.getRatePerSqFeet()));
				System.exit(0);
				break;
			case 2:
				System.out.println("Enter Hotel Name: ");
				hotelName=scan.next();
				System.out.println("Enter Room Square Feet Area: ");
				numberOfSqFeet=scan.nextInt();
				System.out.println("Enter Room has TV (yes/no): ");
				temp=scan.next();
				if(temp.equals("yes"))
				{
					hasTV=true;
				}
				else if(temp.equals("no"))
				{
					hasTV=false;
				}
				else
				{
					System.out.println("Invaild Input...");
					hasTV=false;
					System.exit(0);
				}
				System.out.println("Enter Room has Wifi (yes/no): ");
				temp=scan.next();
				if(temp.equals("yes"))
				{
					hasWifi=true;
				}
				else if(temp.equals("no"))
				{
					hasWifi=false;
				}
				else
				{
					System.out.println("Invaild Input...");
					hasWifi=false;
					System.exit(0);
				}
				DeluxeACRoom dac= new DeluxeACRoom(hotelName,numberOfSqFeet,hasTV,hasWifi);
				System.out.println("Room Tariff per day is: "+dac.calculateTariff(dac.numberOfSqFeet,dac.ratePerSqFeet));
				System.exit(0);
				break;
			case 3:
				System.out.println("Enter Hotel Name: ");
				hotelName=scan.next();
				System.out.println("Enter Room Square Feet Area: ");
				numberOfSqFeet=scan.nextInt();
				System.out.println("Enter Room has TV (yes/no): ");
				temp=scan.next();
				if(temp.equals("yes"))
				{
					hasTV=true;
				}
				else if(temp.equals("no"))
				{
					hasTV=false;
				}
				else
				{
					System.out.println("Invaild Input...");
					hasTV=false;
					System.exit(0);
				}
				System.out.println("Enter Room has Wifi (yes/no): ");
				temp=scan.next();
				if(temp.equals("yes"))
				{
					hasWifi=true;
				}
				else if(temp.equals("no"))
				{
					hasWifi=false;
				}
				else
				{
					System.out.println("Invaild Input...");
					hasWifi=false;
					System.exit(0);
				}
				SuiteACRoom sac= new SuiteACRoom(hotelName,numberOfSqFeet,hasTV,hasWifi);
				System.out.println("Room Tariff per day is: "+sac.calculateTariff(sac.numberOfSqFeet,sac.getRatePerSqFeet()));
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
