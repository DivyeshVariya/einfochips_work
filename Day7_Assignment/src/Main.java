import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
 public static void main(String[] args)
 {
	 Scanner scan= new Scanner(System.in);
	 System.out.println("Enter number of players : ");
	 int numPlayers=scan.nextInt();
	 scan.nextLine();
	 int j=0;
	 ArrayList<String> teamlist= new ArrayList<String>();
	 ArrayList<Team> t= new ArrayList<Team>();
//	 Team t[]=new Team[numPlayers];
	 for(int i=0;i<numPlayers;i++)
	 {
		 String temp=scan.nextLine();
		 String[] splitTemp=temp.split("\\|");
		 if(!teamlist.contains(splitTemp[0]))
		 {
			 teamlist.add(splitTemp[0]);
			 System.out.println(splitTemp[0] + splitTemp[1]);
			 t.add(new Team(splitTemp[0]));
			 
			 j++;
		 }
		 int k=0;
		 for(String team :teamlist)
		 {
			 if(team.equals(splitTemp[0]))
			 {
				 t.get(k).addPlayer(splitTemp[1]);
				 break;
			 }
			 k++;
		 }
	 }
	 System.out.println("Sorted Teams and Players : ");
	 Collections.sort(t);
	 for(int i=0;i<j;i++)
	 {
	 System.out.println("Team name :"+t.get(i).getName()+"\n");
	 ArrayList<Player> lists= new ArrayList<Player>();
	 lists=t.get(i).getPlayerList();
	 for(int ii=0;ii<lists.size();ii++)
	 {
		 System.out.println("\t-- "+lists.get(ii).getNamePlayer());
	 }
	 }
 }
}
