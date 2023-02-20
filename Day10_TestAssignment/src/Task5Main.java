import java.util.ArrayList;
import java.util.Scanner;



public class Task5Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number of players");
		Scanner sc = new Scanner(System.in);
		int numberOfPlayers = sc.nextInt();
		sc.nextLine();
		ArrayList<Player5> players = new ArrayList<Player5>();
		for (int i = 1; i <= numberOfPlayers; i++) {

			String details = sc.nextLine();
			players.add(Player5.createPlayer(details));
		}
		
		String highestPlayerFromCountries=Player5.highestCount(players);
		System.out.println("The nationality with maximum players: "+highestPlayerFromCountries);
	}

}