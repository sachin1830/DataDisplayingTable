package com.org.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection 
{
	public static Connection createConnection() throws ClassNotFoundException, SQLException
	{
		Connection con=null;
		String url = "jdbc:mysql://localhost:3306/registration_database";
	    String username = "root";
		String password = "Sachin@1830";
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(url, username, password);
		return con;
	}

}
