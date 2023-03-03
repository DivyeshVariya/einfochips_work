package task1;

public class Player {
	
	public long getPlayerid() {
		return playerid;
	}
	public void setPlayerid(long playerid) {
		this.playerid = playerid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Skill getSkill() {
		return skill;
	}
	public void setSkill(Skill skill) {
		this.skill = skill;
	}
	private long playerid;
	private String name;
	private String country;
	private Skill skill;
	public Player(long playerid, String name, String country, Skill skill) {
		super();
		this.playerid = playerid;
		this.name = name;
		this.country = country;
		this.skill = skill;
	}

}
