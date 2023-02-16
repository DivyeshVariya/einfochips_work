
public class Team {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getNumberOfMatches() {
		return numberOfMatches;
	}
	public void setNumberOfMatches(long numberOfMatches) {
		this.numberOfMatches = numberOfMatches;
	}
	private long numberOfMatches;
	public Team(String name, long numberOfMatches) {
		super();
		this.name = name;
		this.numberOfMatches = numberOfMatches;
	}
}
