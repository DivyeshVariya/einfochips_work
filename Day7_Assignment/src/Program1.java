import java.util.Scanner;
import java.util.TreeSet;

public class Program1 {

	public static void main(String[] args)
	{
		Scanner scan= new Scanner(System.in);
		TreeSet<String> players= new TreeSet<String>();
		System.out.println("Enter number of matches :");
		int numMatch=scan.nextInt();
		System.out.println("Enter Name of player for "+numMatch+" :");
		for(int i=0;i<numMatch;i++)
		{
			players.add(scan.next());
		}
		System.out.println("\t --- Output ---\n");
		System.out.println(players);
	}
}
