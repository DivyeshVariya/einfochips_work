public class Player implements Comparable<Player>{
	private String namePlayer;

	public String getNamePlayer() {
		return namePlayer;
	}

	public void setNamePlayer(String namePlayer) {
		this.namePlayer = namePlayer;
	}

	public Player(String namePlayer) {
		super();
		this.namePlayer = namePlayer;
	}

	@Override
	public int compareTo(Player o) {
		// TODO Auto-generated method stub
		return this.namePlayer.compareTo(o.namePlayer);
	}
	
}
