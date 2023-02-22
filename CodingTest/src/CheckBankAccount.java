import java.util.Scanner;
import java.util.TreeSet;

public class CheckBankAccount {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter Number of Input :");
	int numOFAccount=scan.nextInt();
	if(numOFAccount<0)
	{
		System.out.println("Invalid Input...");
		System.exit(0);
	}
	else if(numOFAccount==0)
	{
		System.out.println("Terminate program because input is 0.");
		System.exit(0);
	}
	else
	{
	int[] accountList= new int[numOFAccount];
	for(int i=0;i<numOFAccount;i++)
	{
		System.out.println("Enter Account Number :");
		accountList[i]=scan.nextInt();
	}
	checkData(accountList);
	System.out.println("Enter Branch Code :");
	int branchCode=scan.nextInt();
	if(branchCode<0)
	{
		System.out.println("Invalid Branch Code...");
		System.exit(0);
	}
	else if(branchCode<100 || branchCode>999) {
		System.out.println("Invalid input of branch code ...");
		System.exit(0);
	}
	for(int account : accountList)
	{
		String strAccount="" +account;
		int subAccount1=Integer.parseInt(strAccount.substring(0,3));
		int subAccount2=Integer.parseInt(strAccount.substring(3,6));
		if(subAccount1==branchCode) {
			System.out.println("Available Accounts : "+subAccount2);
		}
	}
	}
}

private static void checkData(int[] accountList) {
	// TODO Auto-generated method stub
	TreeSet<Integer> list= new TreeSet<Integer>();
	for(int i=0;i<accountList.length;i++)
	{
		if(accountList[i]<0)
		{
			System.out.println("Invalid Customer Account Number...");
			System.exit(0);
		}
		if(String.valueOf(accountList[i]).length()!=6)
		{
			System.out.println("Invalid Customer Account Number because number should be 6 digits...");
			System.exit(0);
		}
		list.add(accountList[i]);
	}
	if(list.size()!=accountList.length)
	{
		System.out.println("Invalid Customer Account Number because each number must be unique...");
		System.exit(0);
	}
}
}
