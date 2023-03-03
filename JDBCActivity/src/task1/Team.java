package task1;

public class Team {

	private Long teamId;  
	public Team(Long teamId, String name, String coach, String captain, City city) {
		super();
		this.teamId = teamId;
		this.name = name;
		this.coach = coach;
		this.captain = captain;
		this.city = city;
	}
	private String name;
	public Long getTeamId() {
		return teamId;
	}
	public void setTeamId(Long teamId) {
		this.teamId = teamId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCoach() {
		return coach;
	}
	public void setCoach(String coach) {
		this.coach = coach;
	}
	public String getCaptain() {
		return captain;
	}
	public void setCaptain(String captain) {
		this.captain = captain;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	private String coach;
	private String captain;
	private City city;
}
