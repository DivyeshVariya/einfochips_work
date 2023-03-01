package com.ILP.main;

import java.util.List;
import java.util.Scanner;

import com.ILP.dao.TeamDao;
import com.ILP.model.Team;

public class DemoMain {
public static void main(String[] args) throws Exception {
	Scanner scan= new Scanner(System.in);
	
	System.out.println("1 for insert");
	System.out.println("2 for update");
	System.out.println("3 for delete");
	System.out.println("4 for view ");
	System.out.println("Enter choice :");
	int choice=scan.nextInt();
	scan.nextLine();
	switch(choice) {
	case 1:
		System.out.println(" player id :");
		
		String pid=scan.nextLine();
		
		System.out.println(" player name :");
		String pname=scan.nextLine();
		
		System.out.println(" player number contact :");
		String pnumber=scan.nextLine();
		
		System.out.println(" player address :");
		String address=scan.nextLine();
		
		System.out.println(" player role :");
		String details=scan.nextLine();
		
		Team t1= new Team(pid,pname,pnumber,address,details);
		System.out.println(t1.getPid()+" "+t1.getPname()+" "+t1.getPnumber()+" "+t1.getAddress()+" "+t1.getDetails());
		TeamDao td= new TeamDao();
		if(td.insertTeam(t1)==false)
		{
			System.out.println("Data inserted....");
		}
		else
		{
			System.out.println("Fail to insert data into db...");
		}
		break;
		
	case 2:
		System.out.println("Please ! Enter palyer id for update :");
		String pid1=scan.nextLine();
		TeamDao  td2= new TeamDao();
		boolean lt=td2.updateTeam(pid1);
		if(lt)
		{
			System.out.println("Data updated....");
		}
		else
		{
			System.out.println("Fail to update data to db...");
		}
		break;
	case 3:
		System.out.println("Please ! Enter palyer id for delete :");
		String pid11=scan.nextLine();
		TeamDao  td21= new TeamDao();
		boolean lt1=td21.DeteleTeam(pid11);
		if(lt1)
		{
			System.out.println("Data deleted....");
		}
		else
		{
			System.out.println("Fail to delete data to db...");
		}
		break;
	case 4:
		TeamDao  td1= new TeamDao();
		List<Team> lt11=td1.getAllTeams();
		for(Team t :lt11)
		{
		System.out.println(t.getPid()+" "+t.getPname()+" "+t.getPnumber()+" "+t.getAddress()+" "+t.getDetails());
		}
		System.out.println("Data successfully feteched from db...");
		break;
	default :
		System.out.println("Inavild input...");
		break;
	}
}
}
