import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Please provide the number of players to be registered :");
		int numPlayer=scan.nextInt();
		scan.nextLine();
		String playerName;
		String skill;
		Player p[]=new Player[numPlayer];
		List<Player> al = new ArrayList<>();
		for(int i=0;i<numPlayer;i++)
		{
			System.out.println("Please enter player name :");
			playerName=scan.nextLine();
			System.out.println("\n--Please select the skill of the player\r\n"
					+ "1.All Rounder\r\n"
					+ "2.Batsman\r\n"
					+ "3.Bowler");
			int choice=scan.nextInt();
			switch(choice)
			{
			case 1:
				skill="All Rounder";
				p[i]=new Player(playerName,skill);
				break;
			case 2:
				skill="Batsman";
				p[i]=new Player(playerName,skill);
				break;
			case 3:
				skill="Bowler";
				p[i]=new Player(playerName,skill);
				break;
			default:
				System.out.println("Invaild Input...");
				System.exit(0);
				break;
			}
			scan.nextLine();
		}
		for(int j=0;j<numPlayer;j++)
		{
			al.add(p[j]);
		}
		System.out.println(al.get(0).getSkill());
		Collections.sort(al,new PlayerComparator());
		for(int i=0;i<numPlayer;i++)
		{
			System.out.println(p[i].getName() +" "+p[i].getSkill());
		}
	}
}
