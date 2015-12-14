package com.centennialcollege.jdbc.beans;

public class Player
{
	//PRIVATE INSTANCE VARIABLES
	private int _playerId;
	private String _firstName;
	private String _lastName;
	private String _address;
	private String _postalCode;
	private String _province;
	private String _phoneNum;
	
	//PUBLIC PROPERTIES
	public int getPlayerId() 
	{
		return this._playerId;
	}
	public void setPlayerId(int playerId)
	{
		this._playerId = playerId;
	}
	public String getFirstName() 
	{
		return this._firstName;
	}
	public void setFirstName(String firstName)
	{
		this._firstName = firstName;
	}
	public String getLastName() 
	{
		return this._lastName;
	}
	public void setLastName(String lastName)
	{
		this._lastName = lastName;
	}
	public String getAddress() 
	{
		return this._address;
	}
	public void setAddress(String address)
	{
		this._address = address;
	}
	public String getPostalCode() 
	{
		return this._postalCode;
	}
	public void setPostalCode(String postalCode)
	{
		this._postalCode = postalCode;
	}
	public String get_province() 
	{
		return this._province;
	}
	public void setProvince(String province)
	{
		this._province = province;
	}
	public String getPhoneNum() 
	{
		return this._phoneNum;
	}
	public void setPhoneNum(String phoneNum)
	{
		this._phoneNum = phoneNum;
	}
}