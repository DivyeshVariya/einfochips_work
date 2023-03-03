package task1;

public class Skill {

	public long getSkillid() {
		return skillid;
	}
	public void setSkillid(long skillid) {
		this.skillid = skillid;
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	private long skillid;
	private String skillName;
	public Skill(long skillid, String skillName) {
		super();
		this.skillid = skillid;
		this.skillName = skillName;
	}
}
