package com.example.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.example.demo.model.Person;

public class PersonDao {
	public boolean DBInsert(Person u) throws SQLException {
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/feedback", "root", "root");
		String query = "INSERT INTO feedbackdata VALUES(?, ?, ?)";
		PreparedStatement ps = c.prepareStatement(query);
		ps.setString(1, u.getName());
		ps.setString(2, u.getEmail());
		ps.setString(3, u.getMsg());
		return ps.execute();
	}
}
