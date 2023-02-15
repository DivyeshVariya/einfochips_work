/*
 * Create a class “Company” add the following private members

Data type Field name

String name

String employees

String teamlead

Secure the above attributes.

Create another class “CompanyMain” and write the main method to test the above class.
 */

import java.util.Scanner;

public class CompanyMain {
	public static void main(String[] args)
	{
		Company c1= new Company();
		Scanner scan= new Scanner(System.in);
		String temp1,temp2;
		int flag=0;
		System.out.println("Enter the Comapny Name :");
		c1.setName(scan.nextLine());
		System.out.println("Enter the Employees (formate : ram,ramesh):");
		temp1=scan.nextLine();
		c1.setEmployees(temp1);
		System.out.println("Enter the Team Leader :");
		temp2=scan.nextLine();
		c1.setTeamLead(temp2);
		String[] EmployeesList=temp1.split(",");
		for(int i=0;i<EmployeesList.length;i++)
		{
			if(EmployeesList[i].equals(temp2))
			{
				flag=1;
			}
		}
		if(flag==1)
		{
		System.out.println("\nEmployee Detials :\n");
		System.out.println("Company Name : "+c1.getName());
		System.out.println("Employees : "+c1.getEmployees());
		System.out.println("Team Leader : "+c1.getTeamLead());
		}
		else
		{
			System.out.println("\nOutput :\n Invaild Input...");
		}
	}

}
