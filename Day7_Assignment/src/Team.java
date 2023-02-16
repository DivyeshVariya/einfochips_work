import java.util.ArrayList;
import java.util.Collections;

public class Team implements Comparable<Team>{

	private String nameteam;
	private ArrayList<Player> playersList= new ArrayList<Player>();
	
	public Team(String name) {
		super();
		this.nameteam = name;
	}
	public String getName() {
		return nameteam;
	}
	public void setName(String name) {
		this.nameteam = name;
	}
	public void addPlayer(String playername)
	{
		playersList.add(new Player(playername));
	}
	
	public ArrayList getPlayerList()
	{
		Collections.sort(playersList);
		return playersList;
	}
	
	@Override
	public int compareTo(Team o) {
		// TODO Auto-generated method stub
		return this.nameteam.compareTo(o.nameteam);
	}
	
	
}
