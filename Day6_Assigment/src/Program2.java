import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Program2 {
	public static void main(String[] args)
	{
		try
		{
		Scanner scan=new Scanner(System.in);
		ArrayList<String> al=new ArrayList<String>();
		int swap1,swap2;
		System.out.println("Enter top 5 teams of IPL season 15 :");
		for(int i=0;i<5;i++)
		{
			al.add(scan.nextLine());
		}
		System.out.println("Enter swap positions 1:");
		swap1=scan.nextInt();
		System.out.println("Enter swap positions 2:");
		swap2=scan.nextInt();
		Collections.swap(al,swap1,swap2);
		for(int i=0;i<5;i++)
		{
			System.out.println(al.get(i));
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}
}
