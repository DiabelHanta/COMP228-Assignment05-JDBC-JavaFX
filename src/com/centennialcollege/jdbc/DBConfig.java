package com.centennialcollege.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConfig 
{
	//PRIVATE CONSTANTS (STATIC)
	private static final String CONN_STRING = "jdbc:mysql://localhost/gamedb";
	private static final String USERNAME = "faim";
	private static final String PASSWORD = "ilikepie";
	
	//UTILITY METHOD - Connects to the MySQL database
	public static Connection getConnection() throws SQLException
	{
		//
		return DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
	}
	
	//UTILITY METHOD - Displays our errors in more detail
	public static void displayException(SQLException exception)
	{
		System.err.println("Error Message: " + exception.getMessage());
		System.err.println("Error Code: " + exception.getErrorCode());
		System.err.println("SQL State: " + exception.getSQLState());
	}
}