/*
 * Create a class “Employee” add the following private members

Data type Field name

String name

String address

String mobile

Secure the above members.

Create another class “EmployeeMain” and write the main method to test the above class
 */

public class Employee7 {
	private String name;
	private String address;
	private String mobile;
	
	public void setName(String Name)
	{
		this.name=Name;
	}
	public String getName()
	{
		return this.name;
	}
	public void setAddress(String Address)
	{
		this.address=Address;
	}
	public String getAddress()
	{
		return this.address;
	}
	public void setMobile(String Mobile)
	{
		this.mobile=Mobile;
	}
	public String getMobile()
	{
		return this.mobile;
	}

}
