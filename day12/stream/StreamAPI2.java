package com.cts.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class StreamAPI2 {

	public static void main(String[] args) {
		List<Employee> employee = new ArrayList<Employee>();
		addEmployees(employee);
		//to print all employee objects
	/*	employee.forEach(System.out::println); */
		
		
		//Employee with age less than 22
		List<Employee> ageScale = employee.stream().filter(emp ->emp.getAge() < 22 && emp.getAdress().equals("Chennai")).collect(Collectors.toList());
		System.out.println("Employees with age less than 22");
		ageScale.forEach(System.out::println);
		
		//Name Length is greater than 5
		List<Employee> lengthScale=employee.stream().filter(emp->emp.getName().length() > 5).collect(Collectors.toList());
		System.out.println("Employees with name length greater than 5");
		lengthScale.forEach(System.out::println);

		//Increase the salary byu 10% and return it
		//only shows increased salary
		//List<Double> salincrease = employee.stream().map(emp->emp.getSalary()*1.1).collect(Collectors.toList());
		//OR
		//shows all fields
		List<Employee> salincrease = employee.stream().map(emp->{
		emp.setSalary(emp.getSalary() *1.1);
		return emp;
	      })
        .collect(Collectors.toList());
		System.out.println("10% increase in Salary");
		salincrease.forEach(System.out::println);
	}
	private static void addEmployees(List<Employee> employee)
	{
		Employee emp1=new Employee(101,"Abin","Chennai",22,100,8665645);
		Employee emp2=new Employee(102,"Anu","Hyderabad",21,400,76327836);
		Employee emp3=new Employee(103,"Alby","Kerala",28,340,86656565);
		Employee emp4=new Employee(104,"Anju","Pune",23,450,765656);
		Employee emp5=new Employee(101,"Aniket","Chennai",19,230,8634445);
		employee.add(emp1);
		employee.add(emp2);
		employee.add(emp3);
		employee.add(emp4);
		employee.add(emp5);
		
		
		
		
	}

}
