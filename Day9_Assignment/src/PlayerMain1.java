import java.io.*;
import java.util.*;

public class PlayerMain1 {
	public static void main(String[] args) throws IOException {

		HashMap<String,ArrayList<Wicket>> players=new HashMap<String,ArrayList<Wicket>>();
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		boolean flag1 = true;
		
		while(flag1)
		{
			System.out.println("Enter the player name:");	
			ArrayList<Wicket> wickets=new ArrayList<Wicket>();
			
			String playerName = reader.readLine();
			
			String pipe = "|";

			System.out.println("Enter wickets - sepreted by " + pipe + "symbole.");
			
			String wicketsInput[]=reader.readLine().split("\\|");
			
			
			for(String wicket:wicketsInput)
			{
				wickets.add(new Wicket(wicket,new Bowler(playerName)));
			}
			
			
			System.out.println("Do you want to add another player (yes/no)");
			
			if (reader.readLine().equals("no")) {
				flag1 = false;
			}
			
			players.put(playerName, wickets);
			
			
		}
		
		boolean flag2=true;
		while(flag2)
		{
			System.out.println("Enter the player name to search");
			
			String playerNameTOSearch = reader.readLine();
			
			if(players.containsKey(playerNameTOSearch))
			{
				System.out.println("Player name :" + playerNameTOSearch);
				ArrayList<Wicket> wicketsAnswer = players.get(playerNameTOSearch);
				for(Wicket wicket:wicketsAnswer)
				{
					System.out.println(wicket.getPlayerName());
				}
			}
			else
			{
				System.out.println("No player found with name "+ playerNameTOSearch);

			}
			System.out.println("Do you want to search another player (yes/no)");
			if (reader.readLine().equals("no")) {
				flag2 = false;
			}
			
		}
	}
}