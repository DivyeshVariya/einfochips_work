import java.util.Arrays;
import java.util.Scanner;

public class ExceptionMain1 {

	public static void main(String[] args)
	{
		try
		{
		Scanner scan = new Scanner(System.in);
		String[] teamList= {"Chennai Super Kings","Sun Risers","Delhi Daredevils"
				,"Kings XI Punjab"
				,"Kolkata Knight Riders"
				,"Mumbai Indians"
				,"Rajasthan Royals"
				,"Royal Challengers Bangalore"};
		System.out.println("Enter the expected winner team of IPL Season 10 :");
		String exceptWin=scan.nextLine();
		if(!Arrays.asList(teamList).contains(exceptWin))
		{
			throw new CustomException1("Entered team is not a part of IPL Season 10");
		}
		System.out.println("Enter the expected runner Team of IPL Season 10 :");
		String exceptRunner=scan.nextLine();
		if(!Arrays.asList(teamList).contains(exceptRunner))
		{
			throw new CustomException1("Entered team is not a part of IPL Season 10");
		}
		System.out.println("\t --- Result ---\n"
				+ "Expected IPL Season 10 winner: "+ exceptWin
				+"\nExpected IPL Season 10 runner: "+ exceptRunner);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
