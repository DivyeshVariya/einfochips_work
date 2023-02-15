import java.util.ArrayList;
import java.util.Scanner;

public class Program3 {
	public static void main(String[] Args)
	{
		Scanner scan= new Scanner(System.in);
		ArrayList<String> season14Player= new ArrayList<String>();
		ArrayList<String> season15Player= new ArrayList<String>();
		System.out.println("Enter the top 5 scorers of IPL Season 14 :");
		for(int i=0;i<5;i++)
		{
			season14Player.add(scan.nextLine());
		}
		System.out.println("Enter the top 5 scorers of IPL Season 15 :");
		for(int i=0;i<5;i++)
		{
			season15Player.add(scan.nextLine());
		}
		season15Player.retainAll(season14Player);        
		System.out.println("Consistent Scorer in both seasons : ");
		for(int i=0;i<season15Player.size();i++)
		{
		System.out.println(season15Player.get(i));
		}
	}

}
