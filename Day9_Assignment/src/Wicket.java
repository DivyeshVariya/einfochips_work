public class Wicket {
	
	private String playerName;
	
	Bowler bowler = new Bowler(playerName);
	
	public Wicket(String playerName, Bowler bowler) {
		super();
		this.playerName = playerName;
		this.bowler = bowler;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public Bowler getBowler() {
		return bowler;
	}

	public void setBowler(Bowler bowler) {
		this.bowler = bowler;
	}

}
