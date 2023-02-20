import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TaskMain1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ArrayList<Player> players = new ArrayList<Player>();
		System.out.println("Enter the name of the Team: ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String name = reader.readLine();
		Team team = new Team(name, players);
		int choice=0;
		while (choice != 4) {
		System.out.println("1.Add Player ");
		System.out.println("2.Delete Player ");
		System.out.println("3.Display Players");
		System.out.println("4.Exit");
		System.out.println("Enter your choice");
		choice = Integer.parseInt(reader.readLine());
		
		
			switch (choice) {
			case 1: // add player
				System.out.println("Enter the details of player in CSV format:");
				String details = reader.readLine();
				team.addPlayerToTeam(Player.createPlayer(details));
				break;
			case 2: // delete player
				System.out.println("Enter the name of the player to be deleted:");
				boolean result = team.removePlayerFromTeam(reader.readLine());
				if (result)
					System.out.println("Player successfully deleted");
				else
					System.out.println("Player not found");
				break;
			case 3:
				System.out.format("%-15s %-15s %-15s %-20s %-15s %-15s %-15s %s\n","Name","Date of Birth","Skill","Number of Matcbes","Runs","Wickets","Nationality","Power Rating");
				for (Player player : team.getPlayerList())
					System.out.printf("%-15s%-15s%-10s%-15s%-10s%-10s%-15s%-10s\n", player.getName(),player.getDate().toString(),player.getSkill(),player.getNumberOfMatches(),player.getRuns(),player.getWickets(),player.getNationality(),player.getPowerRating()); 
				break;
			case 4:
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}
		}
	}

}