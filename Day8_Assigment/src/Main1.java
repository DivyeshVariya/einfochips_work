import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main1 {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter number of teams: ");
	int numTeam=scan.nextInt();
	scan.nextLine();
	String name;
	long match;
	Team[] t= new Team[numTeam];
	List<Team> al = new ArrayList<>();
	for(int i=0;i<numTeam;i++)
	{
		System.out.println("Enter team "+i+1+"detail\r\n"
				+ "Enter Name :");
		name=scan.nextLine();
		System.out.println("Enter number of matches :");
		match=scan.nextLong();
		scan.nextLine();
		t[i]= new Team(name,match);
	}
	for(int j=0;j<numTeam;j++)
	{
		al.add(t[j]);
	}
	Collections.sort(al,new TeamComparator());
	System.out.println("Team list after sort by number of matches : ");
	for(int i=0;i<numTeam;i++)
	{
		System.out.println("-->"+(i+1)+" "+al.get(i).getName() +" -> "+al.get(i).getNumberOfMatches());
	}
}
}
