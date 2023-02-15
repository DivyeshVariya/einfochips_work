
public class SuiteACRoom extends HotelRoom{
	
	private int ratePerSqFeet;
	public SuiteACRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		ratePerSqFeet=15;
		// TODO Auto-generated constructor stub
	}
	public int getRatePerSqFeet()
	{
		if(hasWifi==true)
		{
			return ratePerSqFeet+2;
		}
		else
		{
			return ratePerSqFeet;
		}
	}

}
