package com.org.model;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DaoClass 
{
   public static ResultSet execute()
   {
	   ResultSet rs = null;
	   try {
		Connection con=DBConnection.createConnection();
		Statement st=con.createStatement();
		String querry="select *from container";
		 rs=st.executeQuery(querry);
		// System.out.println(rs);
	}  catch (ClassNotFoundException | SQLException e) {
	
		System.out.println(e);
	}
	//System.out.println(rs);
	return rs; 
   }
}
