import java.io.IOException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;

public class Task3Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number of players");
		Scanner sc = new Scanner(System.in);
		int numberOfPlayers = sc.nextInt();
		sc.nextLine();
		ArrayList<Player> players = new ArrayList<Player>();
		for (int i = 1; i <= numberOfPlayers; i++) {

			String details = sc.nextLine();
			players.add(Player.createPlayer(details));
		}

		
		while (true) {
			System.out.println("Enter a type to sort:\r\n" + "1.Sort by number of matches played\r\n"
					+ "2.Sort by runs scored\r\n" + "3.Sort by power rating\r\n" + "");
			int choice=sc.nextInt();
			sc.nextLine();
			switch(choice)
			{
				case 1: //sort by number of matches
					Collections.sort(players,(p,q)->{
						if(p.getNumberOfMatches()> q.getNumberOfMatches()) return 1;
						if(p.getNumberOfMatches()<q.getNumberOfMatches()) return -1;
						return 0;
					}
						);
					break;
				case 2: //sort by runs scored
					Collections.sort(players,(p,q)->{
						if(p.getRuns()> q.getRuns()) return 1;
						if(p.getRuns()<q.getRuns()) return -1;
						return 0;
					}
						);
					break;
				case 3:	//sort by power rating
					Collections.sort(players,(p,q)->{
						if(p.getPowerRating()> q.getPowerRating()) return 1;
						if(p.getPowerRating()<q.getPowerRating()) return -1;
						return 0;
					}
						);
					break;
				default:	
					break;
			}
			System.out.printf("%-15s%-15s%-10s%-15s%-10s%-10s%-15s%-10s\n", "Name","Date of birth","Skill","No of matches","Runs","Wickets","Nationality","Rating");
			for (Player player : players)
				System.out.printf("%-15s%-15s%-10s%-15s%-10s%-10s%-15s%-10s\n", player.getName(),
						player.getDate().toString(), player.getSkill(),player.getNumberOfMatches(), player.getRuns(),
						player.getWickets(), player.getNationality(), player.getPowerRating());
		}

	}

}