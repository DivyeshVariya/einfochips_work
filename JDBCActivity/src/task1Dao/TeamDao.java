package task1Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import task1.Player;
import task1.Team;

public class TeamDao {

	public List<Team> getAllTeams() throws SQLException
	{
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcactivity","root","root");
		String query="Select * from team";
		PreparedStatement ps = c.prepareStatement(query);
		ResultSet rs=ps.executeQuery();
		List<Team> li=new ArrayList<Team>();
		CityDao sd= new CityDao();
		while(rs.next())
		{
			li.add(new Team(rs.getLong(1),rs.getString(2),rs.getString(3),rs.getString(5),sd.getCityByID(rs.getLong(4))));
		}
		c.close();
		return li;
	}
}
