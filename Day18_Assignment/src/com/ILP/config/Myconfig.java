package com.ILP.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class Myconfig {
	public static Connection getConnection() throws Exception{
		Connection c=DriverManager.getConnection("jdbc://localhost:3306/ipl","root","root");
		return c;
	}

}
