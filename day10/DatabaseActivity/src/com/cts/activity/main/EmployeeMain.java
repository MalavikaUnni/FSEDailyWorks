package com.cts.activity.main;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.jdbc.PreparedStatement;
//import com.mysql.jdbc.Statement;


public class EmployeeMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
	Class.forName("com.mysql.jdbc.Driver");
	
	//Establish the connection with database
	String url="jdbc:mysql://localhost:3306/cts";
	String username ="root";
	String password="root";
	
	Connection conn= DriverManager.getConnection(url, username, password);
	//System.out.println("Connection Established");
	
	//create a Statement
	
	//Statement stmt= conn.createStatement(); 
	//String query="insert into employee values(103,'sindhura','Hyderabad',62536523)";
	//String query="update employee set address='Andhra' where id=103";
	//String query="delete from employee where id=103";
	//int result =stmt.executeUpdate(query);
	/*if(result>0)
	{
		//System.out.println("Data Inserted Succesfully");
		//System.out.println("Updated Successfully");
		System.out.println("Deleted");
	}
	else
	{
		System.out.println("try again");
	} */
	
	/*String query ="select * from employee";
	ResultSet rs =stmt.executeQuery(query);
	
	while(rs.next())
	{
		System.out.println(rs.getInt(1)+ " : " +rs.getString(2) + " : " +rs.getString(3)+ " : " +rs.getLong(4));
		
	}*/
	
	Scanner sc= new Scanner(System.in);
	System.out.println("enter id");
	int id= Integer.parseInt(sc.nextLine());
	System.out.println("enter name");
	String name=sc.nextLine();
	System.out.println("enter address");
	String address = sc.nextLine();
	System.out.println("enter phone");
	long phone=Integer.parseInt(sc.nextLine());
	
	
	String query="insert into employee values(?,?,?,?)";
	PreparedStatement ps = (PreparedStatement) conn.prepareStatement(query);
	ps.setInt(1, id);
	ps.setString(2, name);
	ps.setString(3,address);
	ps.setLong(4, phone);
	
	
	int result = ps.executeUpdate();
	if(result>0)
	{
		System.out.println("Data inserted successfully");
	}
	else
	{
		System.out.println("try again");
	}
	
	
	}

}
