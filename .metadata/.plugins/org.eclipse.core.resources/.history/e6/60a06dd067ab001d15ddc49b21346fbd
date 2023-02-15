
public class DeluxeRoom extends HotelRoom{

	protected int ratePerSqFeet;
	public DeluxeRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		ratePerSqFeet=10;
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
