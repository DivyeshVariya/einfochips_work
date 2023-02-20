import java.time.LocalDate;
import java.util.List;

public class Team {
	private String name;
	private List<Player> playerList;
	
	public void displayPlayers() {
		for(Player player:this.playerList)
		{
			System.out.println(player);
		}
	}
	
	public void addPlayerToTeam(Player player) {
			this.playerList.add(player);
	}
	public Boolean removePlayerFromTeam(String name) {
		for(int i=0;i<this.playerList.size();i++)
		{
			if(this.playerList.get(i).getName().equals(name))
			{
				this.playerList.remove(i);
			    return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Team name=" + name ;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Player> getPlayerList() {
		return playerList;
	}
	public void setPlayerList(List<Player> playerList) {
		this.playerList = playerList;
	}
	public Team() {
		super();
	}
	public Team(String name, List<Player> playerList) {
		super();
		this.name = name;
		this.playerList = playerList;
	}
}