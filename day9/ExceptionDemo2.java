package com.cts.day9;
import java.util.*;;
public class ExceptionDemo2
{
	public static boolean isValidUser(String name) throws InvalidUser
	{
		if(!name.equals("ADMIN"))
				{
			throw new InvalidUser();
				}
		return true;
	}
	public static void main(String [] args)
	{
	try
	{
		isValidUser("MALAVIKA");
	}
	catch(InvalidUser ex)
	{
		System.out.println(ex.getMessage());
	}
}
}

class InvalidUser extends Exception 
{
	public InvalidUser()
	{
		
	}
	InvalidUser(String message)
	{
		System.out.println(message);
	}
	public String getMessage()
	{
		return "INVALID USER";
	}
}	