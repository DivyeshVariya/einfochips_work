import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class MatchMain {
  public static void main(String[] args)
  {
	  Scanner scan= new Scanner(System.in);
	  int matchNo;
	  String matchDate;
	  String teamOne;
	  String teamTwo;
	  System.out.println("Enter the number of matches :");
	  matchNo=scan.nextInt();
	  Match m[]= new Match[matchNo];
	  for(int i=0;i<matchNo;i++)
	  {
	  System.out.println("Enter the match Date in (yyyy-MM-dd):");
	  matchDate=scan.next();
	  System.out.println("Enter the team one :");
	  teamOne=scan.next();
	  System.out.println("Enter the team two :");
	  teamTwo=scan.next();
	  m[i]=new Match(LocalDate.parse(matchDate),teamOne,teamTwo);
	  }
	// Sorting the array
      Arrays.sort(m);
      System.out.println("\t --- sorted data ---");
      for(int i=0;i<matchNo;i++)
	  {
    	  System.out.println("Team 1 : "+m[i].getTeamOne());
    	  System.out.println("Team 2 : "+m[i].getTeamTwo());
    	  System.out.println("Match Held on : "+m[i].getMatchDate());
	  }
	  
  }
}
