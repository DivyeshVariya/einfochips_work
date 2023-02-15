/*
 * Create a class “Innings” add the following private members are

Data type Field name

String teamname

String inningsname

Int runs

Secure the above attributes.

Create the displayInningsDetails() method in the Innings class display it.

Create another class “InningsMain” and write the main method to test the above class
 */


public class Innings {
	
	private String teamname;
	private String inningsname;
	private int runs;
	
	public void setTeamName(String Name)
	{
		this.teamname=Name;
	}
	public String getTeamName()
	{
		return this.teamname;
	}
	public void setInningsName(String inningsname)
	{
		this.inningsname=inningsname;
	}
	public String getInningsName()
	{
		return this.inningsname;
	}
	public void setRuns(int runs)
	{
		this.runs=runs;
	}
	public int getRuns()
	{
		return this.runs;
	}
	public void displayInningsDetails()
	{
		System.out.println("Team Name : "+ this.teamname);
		System.out.println("Scored : "+ this.runs);
		if(this.inningsname.equals("First"))
		{
			System.out.println("Need "+ (this.runs+1)+" to won...");
		}
		else
		{
			System.out.println("Match Ended...");
		}
	}

}
