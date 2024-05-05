package com.Db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	public static Connection getConnection() {
		
		Connection con = null;
		String url = "jdbc:mysql://localhost/jailer";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");			
			con = DriverManager.getConnection(url, "enoshroy", "enoshroy");	
			
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}

		return con;
	}
	
}
