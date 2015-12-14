package com.centennialcollege.jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class InputHelper 
{
	//METHOD - Gets the string from the console
	public static String getStringInput(String prompt)
	{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(prompt);
		System.out.flush(); //
		
		try
		{
			return input.readLine();
		}
		catch(Exception exception)
		{
			//Error message
			return "Error" + exception.getMessage();
		}
	}
	//FOR VARIOUS INPUT DATATYPE
	//Get INT - ID
	public static int getIntegerInput(String prompt) throws NumberFormatException
	{
		String input = getStringInput(prompt);
		//Parsing for int
		return Integer.parseInt(input);
	}
	public static double getDoubleInput(String prompt) throws NumberFormatException
	{
		String input = getStringInput(prompt);
		//Parsing for double
		return Double.parseDouble(input);
	}
	public static java.sql.Date getDateInput(String prompt) throws ParseException
	{
		String input = getStringInput(prompt);
		//Parsing for date
		Date newDate = new SimpleDateFormat("yyyy-MM-dd").parse(input);
		java.sql.Date SQLDate = new java.sql.Date(newDate.getTime());
		return SQLDate;
	}
}