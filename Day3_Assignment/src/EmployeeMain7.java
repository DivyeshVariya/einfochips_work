import java.util.Scanner;

/*
 * Create a class “Employee” add the following private members

Data type Field name

String name

String address

String mobile

Secure the above members.

Create another class “EmployeeMain” and write the main method to test the above class
 */

import java.util.Scanner;

public class EmployeeMain7 {
	
	public static void main(String[] args)
	{
		Employee7 e1= new Employee7();
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
		
		while(true)
		{
			System.out.println("\nVerify and Update the details:\r\n"
					+ "\r\n"
					+ "\t\tMenu\r\n"
					+ "\r\n"
					+ "1. Update Employee name\r\n"
					+ "\r\n"
					+ "2. Update Employee Address\r\n"
					+ "\r\n"
					+ "3. Update Employee mobile\r\n"
					+ "\r\n"
					+ "4. All information correct/Exit");

			System.out.println("\nSelect Options : ");
			int num=scan.nextInt();
			switch(num)
			{
			case 1:
				System.out.println("... Update Employee Name ...\n");
				System.out.println("Current Employee Name : " + e1.getName());
				System.out.println("Enter new Name : ");
				e1.setName(scan.nextLine());
				System.out.println("Data Successfully Updated....");
				break;
			case 2:
				System.out.println("... Update Employee Address ...\n");
				System.out.println("Current Employee Address : " + e1.getAddress());
				System.out.println("Enter new Address (EX-1,X_soc..) : ");
				e1.setAddress(scan.next());
				System.out.println("Data Successfully Updated....");
				break;
			case 3:
				System.out.println("... Update Employee Mobile ...\n");
				System.out.println("Current Employee Mobile : " + e1.getMobile());
				System.out.println("Enter new Mobile : ");
				e1.setMobile(scan.next());
				System.out.println("Data Successfully Updated....");
				break;
			case 4:
				System.out.println("The Employee Details : ");
				System.out.println("Name : "+e1.getName());
				System.out.println("Address : "+e1.getAddress());
				System.out.println("Mobile : "+e1.getMobile());
				System.out.println("Data Successfully Updated....");
				System.exit(0);
				break;
			default :
				System.out.println("Invaild Input...");
				System.exit(0);
				break;
			}
		}
	}

}
