package task1Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import task1.City;
import task1.Skill;

public class CityDao {

	public City getCityByID(long long1) throws SQLException {
		// TODO Auto-generated method stub
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcactivity","root","root");
		String query="Select cityname from city where cityid=?";
		PreparedStatement ps = c.prepareStatement(query);
		ps.setLong(1, long1);
		ResultSet rs=ps.executeQuery();
		if(!rs.next())
		{
			System.out.println("Fail to fetech data from db...");
			System.exit(0);
		}
		City s=new City(long1,rs.getString(1));
		c.close();
		return s;
	}

}
