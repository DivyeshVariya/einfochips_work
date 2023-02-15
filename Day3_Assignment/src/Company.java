/*
 * Create a class “Company” add the following private members

Data type Field name

String name

String employees

String teamlead

Secure the above attributes.

Create another class “CompanyMain” and write the main method to test the above class.
 */

public class Company {
	
	private String name;
	private String employees;
	private String teamlead;
		
	public void setName(String Name)
	{
		this.name=Name;
	}
	public String getName()
	{
		return this.name;
	}
	public void setEmployees(String employees)
	{
		this.employees=employees;
	}
	public String getEmployees()
	{
		return this.employees;
	}
	public void setTeamLead(String teamlead)
	{
		this.teamlead=teamlead;
	}
	public String getTeamLead()
	{
		return this.teamlead;
	}

}
