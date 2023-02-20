import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Player4 {

	private String name;
	private LocalDate date;
	private String skill;
	private int numberOfMatches;
	private int runs;
	private int wickets;
	private String nationality;
	private double powerRating;

	public Player4(String name, LocalDate date, String skill, int numberOfMatches, int runs, int wickets,
			String nationality, double powerRating) {
		super();
		this.name = name;
		this.date = date;
		this.skill = skill;
		this.numberOfMatches = numberOfMatches;
		this.runs = runs;
		this.wickets = wickets;
		this.nationality = nationality;
		this.powerRating = powerRating;
	}

	

	public static Player4 createPlayer(String detail) {
		String name=detail.split(",")[0];
		String dateOfBirth=detail.split(",")[1];
		String skill=detail.split(",")[2];
		int numberOfMatches=Integer.parseInt( detail.split(",")[3]);
		int runs=Integer.parseInt(detail.split(",")[4]);
		int wickets=Integer.parseInt(detail.split(",")[5]);
		String nationality=detail.split(",")[6];
		double powerRating=Double.parseDouble(detail.split(",")[7]);
		return new Player4(name, LocalDate.parse(dateOfBirth), skill, numberOfMatches, runs, wickets, nationality, powerRating);
	}
	
	static Map<String, Integer> calculateNationalityCount(  List<Player4> list) 
	{
		Set<String> countries = new TreeSet<String>();
		Map<String,Integer> map=new TreeMap<String,Integer>();
		Collections.sort(list,(p,q)->p.getNationality().compareTo(q.getNationality()));
		for(Player4 player:list)
			countries.add(player.getNationality());
		for(String country:countries )
		{
			map.put(country,(int) list.stream().filter(player->player.getNationality().equals(country)).count());
		}
		return map;
	}
	@Override
	public String toString() {
		return "Player name=" + name + ", date=" + date + ", skill=" + skill + ", numberOfMatches=" + numberOfMatches
				+ ", runs=" + runs + ", wickets=" + wickets + ", nationality=" + nationality + ", powerRating="
				+ powerRating ;
	}

	public Player4() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public int getNumberOfMatches() {
		return numberOfMatches;
	}

	public void setNumberOfMatches(int numberOfMatches) {
		this.numberOfMatches = numberOfMatches;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public double getPowerRating() {
		return powerRating;
	}

	public void setPowerRating(double powerRating) {
		this.powerRating = powerRating;
	}

}