package com.ILP.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ILP.config.Myconfig;
import com.ILP.model.Team;
/// crud operation
public class TeamDao {
	
	public boolean insertTeam(Team t1) throws Exception{
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/ipl","root","root");
//		Myconfig mc=new Myconfig();
//		Connection c=mc.getConnection();
		String query="INSERT INTO player VALUES(?, ?, ?,?,?)";
		PreparedStatement ps = c.prepareStatement(query);
		ps.setString(1,t1.getPid());
		ps.setString(2,t1.getPname());
		ps.setString(3,t1.getPnumber());
		ps.setString(4,t1.getAddress());
		ps.setString(5,t1.getDetails());
		return ps.execute();
	}
	
	public List<Team> getAllTeams() throws Exception{
		List<Team> li=new ArrayList<Team>();
		// db logic
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/ipl","root","root");
		
		String query="Select * from player";
		PreparedStatement ps = c.prepareStatement(query);
		ResultSet rs=ps.executeQuery();
		if(!rs.next())
		{
			System.out.println("Fail to fetech data from db...");
			System.exit(0);
		}
		while(rs.next())
		{
			li.add(new Team(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)));
		}
		c.close();
		return li;
	}
	
	public boolean updateTeam(String pid) throws Exception{
		///db logic
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/ipl","root","root");
		
		String query="Select * from player where pid=?";
		PreparedStatement ps = c.prepareStatement(query);
		ps.setString(1,pid);
		ResultSet rs=ps.executeQuery();
		if(!rs.next())
		{
			System.out.println("Fail to fetech data from db...");
			System.exit(0);
		}
		System.out.println("Given player id current data :");
		System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
		System.out.println("Do you want to upadte player name :(yes/no)");
		Scanner scan= new Scanner(System.in);
		String input=scan.nextLine();
		if(input.equals("yes")||input.equals("Yes"))
		{
			System.out.println("Enter new name :");
			String newName=scan.nextLine();
			String query1="update player set pname=? where pid=?";
			PreparedStatement ps1 = c.prepareStatement(query1);
			ps1.setString(1,newName);
			ps1.setString(2,pid);
			ps1.executeUpdate();
			return true;
		}
		else {
			System.out.println("no data upadted...");
			return false;
		}
	}
	
	public boolean DeteleTeam(String pid) throws Exception{
		///db logic
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/ipl","root","root");
		
		String query="delete from player where pid=?";
		PreparedStatement ps = c.prepareStatement(query);
		ps.setString(1,pid);
		int temp=ps.executeUpdate();
		if(temp==1)
		{
		return true;
		}
		else
		{
			return false;
		}
	}

}
