package com.centennialcollege.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Driver 
{
//	//SQL Statement
//	private static String SQLQuery = "SELECT * FROM game_list";
	
	public static void main(String[] args)
	{
		ResultSet resultSet = null;
		
		try
		{
			Connection connection = DBConfig.getConnection();
			System.out.println("Connected!");
		}
		catch(SQLException exception)
		{
			DBConfig.displayException(exception);
		}
	}
}