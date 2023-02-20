import java.io.IOException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Task2Main {

	public static void main(String[] args) throws IOException {
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

		System.out.println("Enter a search type:\n" + "1.By Nationality \n" + "2.By Date of Birth \n"
				+ "3.By Power Rating \n" + "");
		int choice = sc.nextInt();
		sc.nextLine();
		List<Player> requiredPlayers = new ArrayList<Player>();
		switch (choice) {
		case 1:
			System.out.println("Enter the Nationality:");

			requiredPlayers = new PlayerBO().findPlayer(players, sc.nextLine());
			break;
		case 2:
			System.out.println("Enter the Date of Birth:");
			requiredPlayers = new PlayerBO().findPlayer(players, LocalDate.parse(sc.nextLine()));
			break;
		case 3:
			System.out.println("Enter the Power Rating:");
			requiredPlayers = new PlayerBO().findPlayer(players, Double.parseDouble(sc.nextLine()));
			break;
		default:
			System.out.println("Invalid choice");
		}
		if(choice==1 | choice ==2 | choice==3)
		{
			System.out.format("%-15s %-15s %-15s %-20s %-15s %-15s %-15s %s\n","Name","Date of Birth","Skill","Number of Matches","Runs","Wickets","Nationality","Power Rating");
			for (Player player : requiredPlayers)
				System.out.printf("%-15s %-15s %-15s %-20s %-15s %-15s %-15s %s\n", player.getName(),
						player.getDate().toString(), player.getSkill(), player.getNumberOfMatches(), player.getRuns(),
						player.getWickets(), player.getNationality(), player.getPowerRating());
		}
	}

}