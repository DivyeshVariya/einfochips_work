import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class PlayerBO {
	
	public List<Player> findPlayer(List<Player> playerList, String nationality) 
	{
		return playerList.stream().filter(player->player.getNationality().equals(nationality)).collect(Collectors.toList());
	}
	public List<Player> findPlayer(List<Player> playerList, LocalDate dateOfBirth) 
	{
		return playerList.stream().filter(player->player.getDate().equals(dateOfBirth)).collect(Collectors.toList());
	}
	public List<Player> findPlayer( List<Player> playerList,Double powerRating) 
	{
		return playerList.stream().filter(player->player.getPowerRating()==(powerRating)).collect(Collectors.toList());
	}
}