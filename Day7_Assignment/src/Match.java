import java.time.LocalDate;

public class Match implements Comparable<Match>{
	private LocalDate matchDate;
	private String teamOne;
	private String teamTwo;
	public Match(LocalDate matchDate, String teamOne, String teamTwo) {
		super();
		this.matchDate =matchDate;
		this.teamOne = teamOne;
		this.teamTwo = teamTwo;
	}
	public LocalDate getMatchDate() {
		return matchDate;
	}

	public void setMatchDate(LocalDate matchDate) {
		this.matchDate = matchDate;
	}

	public String getTeamOne() {
		return teamOne;
	}

	public void setTeamOne(String teamOne) {
		this.teamOne = teamOne;
	}

	public String getTeamTwo() {
		return teamTwo;
	}

	public void setTeamTwo(String teamTwo) {
		this.teamTwo = teamTwo;
	}
	@Override
	public int compareTo(Match o) {
		// TODO Auto-generated method stub
		return o.getMatchDate().compareTo(matchDate);
	}
}
