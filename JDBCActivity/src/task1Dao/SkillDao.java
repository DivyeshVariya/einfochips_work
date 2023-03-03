package task1Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import task1.Skill;

public class SkillDao {

	public Skill getSkillByID(Long id) throws SQLException
	{
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcactivity","root","root");
		String query="Select skillname from skill where skillid=?";
		PreparedStatement ps = c.prepareStatement(query);
		ps.setLong(1, id);
		ResultSet rs=ps.executeQuery();
		if(!rs.next())
		{
			System.out.println("Fail to fetech data from db...");
			System.exit(0);
		}
		Skill s=new Skill(id,rs.getString(1));
		c.close();
		return s;
	}
}
