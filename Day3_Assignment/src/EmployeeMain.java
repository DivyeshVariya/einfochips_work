/*
 Create a class “Employee” add the following private members

Datatype Fieldname

String name

String address

String mobile

Secure the above attributes.

Create another class “EmployeeMain” and write the main method to test the above clas
 */


import java.util.Scanner;

public class EmployeeMain {
	public static void main(String[] args)
	{
		Employee e1= new Employee();
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the Name :");
		e1.setName(scan.nextLine());
		System.out.println("Enter the Address :");
		e1.setAddress(scan.nextLine());
		System.out.println("Enter the Mobile :");
		e1.setMobile(scan.nextLine());
		
		System.out.println("\nEmployee Detials :\n");
		System.out.println("Name : "+e1.getName());
		System.out.println("Address : "+e1.getAddress());
		System.out.println("Mobile : "+e1.getMobile());
	}
}
