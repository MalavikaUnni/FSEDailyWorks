package com.cts.oops;

import java.util.Scanner;

public class InheritanceDemo {
	public static void main(String [] args)
	{
		//Employee emp=new Employee();
		
		//Manager man=new Manager();
		
		//man.read();
		//man.disp();
		Employee dev=new Developer();
		dev.getData();
		dev.display();
		//dev.getdev();
		//dev.disdev();
		
		
	}

}


class Employee
{
	int id;
	String name;
	String company;
	
	public void display()
	{
		System.out.println(id+ ":" +name+ ":" +company);
	}
	
	public void getData()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter name");
		name=scanner.nextLine();
		System.out.println("enter company");
		company=scanner.nextLine();
		System.out.println("enter id");
		id=Integer.parseInt(scanner.next());
	}
}
class Manager extends Employee
{
	String [] team;
	int num;
	String department;
	
	public void read()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter no of team members");
		num= Integer.parseInt(scanner.nextLine());
		team=new String[num];
		System.out.println("enter team members");
		for(int i=0;i<num;i++)
		{
			team[i]=scanner.nextLine();
		}
		
		System.out.println("enter department");
		department=scanner.nextLine();
		
	}
	public void disp()
	{
		System.out.println("department :" +department);
		System.out.println("team members are:");
		for(int i=0;i<num;i++)
		{
			System.out.println(team[i]);
		}
	}
	
}

class Developer extends Employee
{
	String projectName;
	String domain;
	
	public void getdev()
	{   Scanner scanner=new Scanner(System.in);
		System.out.println("enter projectname");
		projectName=scanner.nextLine();
		System.out.println("enter domain");
		domain=scanner.nextLine();
	}
	public void disdev()
	{
		System.out.println(projectName+" :"+domain);
	
	}
	
}