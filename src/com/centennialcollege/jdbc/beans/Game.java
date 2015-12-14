package com.centennialcollege.jdbc.beans;

public class Game 
{
	//PRIVATE INSTANCE VARIABLES
	private int _gameId;
	private String _title;
	
	//PUBLIC PROPERTIES
	public int getGameId() 
	{
		return this._gameId;
	}
	public void setGameId(int gameId) 
	{
		this._gameId = gameId;
	}
	public String getTitle() 
	{
		return this._title;
	}
	public void setTitle(String title) 
	{
		this._title = title;
	}
}