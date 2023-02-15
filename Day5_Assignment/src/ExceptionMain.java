import java.util.Scanner;

public class ExceptionMain {

	public static void main(String[] args)
	{
		try
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the player name :");
			String playerName=scan.next();
			System.out.println("Enter the player age :");
			int playerAge=scan.nextInt();
			if(playerAge<18)
			{
				throw new CustomException("InvalidAgeRangeException");
			}
			System.out.println("\t ---- Player Details ----\n"
					+ "Player name :"+playerName+" \r\n"
					+ "Player age : "+playerAge);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
