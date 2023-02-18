import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class PlayerMain {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		TreeMap<String,Player> details= new TreeMap<String,Player>();
		System.out.println("Enter the number of players :");
		int numOfPlayers=scan.nextInt();
		scan.nextLine();
		String capNumber;
		String playerData;
		for(int i=0;i<numOfPlayers;i++)
		{
			System.out.println("Enter the details of the player "+(i+1) +": ");
			capNumber=scan.nextLine();
			Player p=new Player();
			p.setName(scan.nextLine());
			p.setTeam(scan.nextLine());
			p.setSkill(scan.nextLine());
//			playerData=scan.nextLine();
			details.put(capNumber,p);
		}
		System.out.println("\t --- Sorted Data ---");
		Set<String> s=details.keySet();
		for(String st: s)
		{
			System.out.println("CapNumber :"+st+" -> Player Name :"+details.get(st).getName()+" -> Team Name :"+details.get(st).getTeam()+" -> Skill :"+details.get(st).getSkill());
		}
	}
}
