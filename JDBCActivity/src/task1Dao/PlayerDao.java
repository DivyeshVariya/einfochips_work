package task1Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import task1.Player;

public class PlayerDao {

	public List<Player> getAllPlayers() throws SQLException{
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcactivity","root","root");
		String query="Select * from palyer";
		PreparedStatement ps = c.prepareStatement(query);
		ResultSet rs=ps.executeQuery();
		List<Player> li=new ArrayList<Player>();
		SkillDao sd= new SkillDao();
		while(rs.next())
		{
			li.add(new Player(rs.getLong(1),rs.getString(2),rs.getString(3),sd.getSkillByID(rs.getLong(4))));
		}
		c.close();
		return li;
	}
}
