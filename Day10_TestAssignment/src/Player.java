import java.time.LocalDate;

public class Player {

	private String name;
	private LocalDate dateOfDate;
	private String skill;
	private Integer numberOfMatches;
	private Integer runs;
	private Integer wickets;
	private String nationality;
	private Double powerRating;
	public Player(String name, LocalDate dateOfDate, String skill, Integer numberOfMatches, Integer runs,
			Integer wickets, String nationality, Double powerRating) {
		super();
		this.name = name;
		this.dateOfDate = dateOfDate;
		this.skill = skill;
		this.numberOfMatches = numberOfMatches;
		this.runs = runs;
		this.wickets = wickets;
		this.nationality = nationality;
		this.powerRating = powerRating;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDate() {
		return dateOfDate;
	}
	public void setDateOfDate(LocalDate dateOfDate) {
		this.dateOfDate = dateOfDate;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public Integer getNumberOfMatches() {
		return numberOfMatches;
	}
	public void setNumberOfMatches(Integer numberOfMatches) {
		this.numberOfMatches = numberOfMatches;
	}
	public Integer getRuns() {
		return runs;
	}
	public void setRuns(Integer runs) {
		this.runs = runs;
	}
	public Integer getWickets() {
		return wickets;
	}
	public void setWickets(Integer wickets) {
		this.wickets = wickets;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public Double getPowerRating() {
		return powerRating;
	}
	public void setPowerRating(Double powerRating) {
		this.powerRating = powerRating;
	}
	public static Player createPlayer(String detail) {
		String[] splitDetail=detail.split(",");
		return new Player(splitDetail[0],LocalDate.parse(splitDetail[1]),splitDetail[2],Integer.parseInt(splitDetail[3]),Integer.parseInt(splitDetail[4]),Integer.parseInt(splitDetail[5]),splitDetail[6],Double.parseDouble(splitDetail[7]));
	}
}
