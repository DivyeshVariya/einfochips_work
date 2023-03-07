package com.practice21.Practiceday21.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.practice21.Practiceday21.model.User;

public class UserDao {
	public boolean registrationDBInsert(User u) throws SQLException {
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/day21activity", "root", "root");
		String query = "INSERT INTO rgst VALUES(?, ?, ?,?)";
		PreparedStatement ps = c.prepareStatement(query);
		ps.setString(1, u.getName());
		ps.setString(2, u.getEmail());
		ps.setString(3, u.getDob());
		ps.setString(4, u.getPassword());
		return ps.execute();
	}

	public boolean fetchUsernamePassword(String username, String password) throws SQLException {
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/day21activity", "root", "root");
		String query = "select * from rgst where username=? AND password=?";
		PreparedStatement ps = c.prepareStatement(query);
		ps.setString(1, username);
		ps.setString(2, password);
		ResultSet rs = ps.executeQuery();
		int rcount = 0;
		while (rs.next()) {
		    ++rcount;
		    // Get data from the current row and use it
		}
		if (rcount == 1) {
			return true;
		}
			return false;
	}
}
