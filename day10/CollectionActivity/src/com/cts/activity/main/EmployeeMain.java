package com.cts.activity.main;

import java.util.List;

import com.cts.activity.bean.Employee;
import com.cts.activity.dao.EmployeeDAO;
import com.cts.activity.daoimpl.EmployeeDAOImpl;

public class EmployeeMain {
	public static void main(String [] args)
	{
		EmployeeDAO employeeDAO =new EmployeeDAOImpl();
		//Employee emp= employeeDAO.getEmployeeById(1);
		//System.out.println(emp);
		
		//to add employee
		Employee employee=new Employee(103,"Akhil","Pune",22,3859489L,85656);
		boolean status=employeeDAO.addEmployee(employee);
		/*if(status)
		{
			System.out.println("Employye added successfully");
		}
		else
		{
			System.out.println("try again");
		}*/
		
		//to show all employees
		List<Employee> list = employeeDAO.getAllEmployees();
		for(Employee employee1 :list)
		{
			System.out.println(employee1);
		}
		
		//to delete 
		Employee delEmployee2= employeeDAO.getEmployeeById(103);
		boolean status1=employeeDAO.deleteEmployee(delEmployee2);
		if(status1)
		{
			System.out.println("Deleted Succesfully");
		}
		else
		{
			System.out.println("Couldn't Delete");
		}
		for(Employee employee1 :list)
		{
			System.out.println(employee1);
		}
		
		
		
		//to update
		
		Employee updateEmployee=employeeDAO.getEmployeeById(101);
		updateEmployee.setAdress("Kerala");
		boolean status2=employeeDAO.updateEmployee(updateEmployee);
		if(status2)
		{
			System.out.println("Updated");
		}
		else
		{
			System.out.println("Couldn't Update");
		}
		for(Employee employee1 :list)
		{
			System.out.println(employee1);
		}
		
		
		
	}

}
