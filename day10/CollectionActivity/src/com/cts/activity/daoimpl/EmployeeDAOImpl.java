package com.cts.activity.daoimpl;

import java.util.ArrayList;
import java.util.List;

import com.cts.activity.bean.Employee;
import com.cts.activity.dao.EmployeeDAO;

public class EmployeeDAOImpl implements EmployeeDAO
{

	static ArrayList<Employee> list=null;
	static
	{
		list=new ArrayList<Employee>();
		Employee emp1=new Employee(101,"Abin","Chennai",22,345678L,8665645);
		Employee emp2=new Employee(102,"Anu","Hyderabad",21,45364563L,76327836);
		list.add(emp1);
		list.add(emp2);
		
	}
	
	@Override
	public boolean addEmployee(Employee employee) {
		
		try {
			list.add(employee);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		for(Employee emp :list)
		{
			if(emp.getId()==employee.getId())
			{
				list.set(list.indexOf(emp), employee);
				return true;
			}
		}
		
		return false;
	}

	@Override
	public boolean deleteEmployee(Employee employee) {
		try {
			list.remove(employee);
			return true;
		} catch (Exception e) {
			
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Employee getEmployeeById(int id) {
        for(Employee employee : list)
        {
        	if(employee.getId()==id)
        	{
        		return employee;
        	}
        }
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		return list;
	}

}
