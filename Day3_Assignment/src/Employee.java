/*
 Create a class “Employee” add the following private members

Datatype Fieldname

String name

String address

String mobile

Secure the above attributes.

Create another class “EmployeeMain” and write the main method to test the above clas
 */

public class Employee {
	
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
