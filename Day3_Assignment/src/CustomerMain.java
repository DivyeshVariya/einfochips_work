/*
 * Create a class “Customer” add the following private members

Data type Field name

String name

String address

String mobile

Secure the above attributes.

Create another class “CustomerMain” and write the main method to test the above class.
 */

import java.util.Scanner;

public class CustomerMain {
	public static void main(String[] args)
	{
		Customer c1= new Customer();
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter Your Details in one line formate(Name,city,mobile):");
		String temp=scan.nextLine();
		if(temp.contains(","))
		{
		String[] details=temp.split(",");
		c1.setName(details[0]);
		c1.setAddress(details[1]);
		c1.setMobile(details[2]);
		
		System.out.println("\nCustomer Detials :\n");
		System.out.println("Name : "+c1.getName());
		System.out.println("Address : "+c1.getAddress());
		System.out.println("Mobile : "+c1.getMobile());
		}
		else
		{
			System.out.println("Invaild Input...");
		}
	}

}
