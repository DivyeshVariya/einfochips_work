package task1;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import task1Dao.PlayerDao;
import task1Dao.TeamDao;

public class Main {

 public static void main(String[] args) throws SQLException {
	 Scanner scan=new Scanner(System.in);
	 System.out.println("-------------Menu--------------");
	 System.out.println("1 - display all players details ");
	 System.out.println("2 - display all team with city");
	 System.out.println("Enter the choice :"); 
	 int choice=scan.nextInt();
	 switch(choice) {
	 case 1: 
		 PlayerDao pd=new PlayerDao();
		 List<Player> li=new ArrayList<Player>();
		 li=pd.getAllPlayers();
		 System.out.println("ID\t\tPlayer Name\t\tCountry Name\t\t Skill"); 
		 for(Player p: li)
		 {
			 System.out.println(p.getPlayerid()+"\t\t"+p.getName()+"\t\t"+p.getCountry()+"\t\t"+p.getSkill().getSkillName());
		 }
		 break;
	 case 2:
		 TeamDao pd1=new TeamDao();
		 List<Team> li1=new ArrayList<Team>();
		 li1=pd1.getAllTeams();
		 System.out.println("ID\t\tTeam Name\t\tCaptain Name\t\tCity Name");   
		 for(Team p: li1)
		 {
			 System.out.println(p.getTeamId()+"\t"+p.getName()+"\t\t"+p.getCoach()+"\t\t"+p.getCity().getCityname());
		 }
		 break;
	default:
		System.out.println("Invaild Input...");
		break;
	 }
 }
}
