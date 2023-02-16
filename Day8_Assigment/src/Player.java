
public class Player {

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	private String name;
	private String skill;
	public Player(String name, String skill) {
		super();
		this.name = name;
		this.skill = skill;
	}
	
	
}
