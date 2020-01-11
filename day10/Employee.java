package com.cts.day10;
import java.lang.*;
import java.util.Comparator;

public class Employee implements Comparable<Employee>
{
	
	private int id;
	private String name;
	private String adress;
	private int age;
	private double salary;
	private double phone;
	
	
	public Employee(int id, String name, String adress, int age, double salary, double phone) {
		super();
		this.id = id;
		this.name = name;
		this.adress = adress;
		this.age = age;
		this.salary = salary;
		this.phone = phone;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getPhone() {
		return phone;
	}
	public void setPhone(double phone) {
		this.phone = phone;
	}


	@Override
	public String toString() {
		return id+" :" +name+ " :" +adress+ ":" +age+ ":" +salary+ ":" +phone;
		}
	/*@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", adress=" + adress + ", age=" + age + ", salary=" + salary
				+ ", phone=" + phone + "]";
	}*/



	@Override
	public int compareTo(Employee employee ) {
		if(this.id> employee.id)
		{
			return 1;
		}
		else if(this.id ==employee.id)
		{
			return 0;
		}
		else
		{
		return -1;
		}
	}
	
}



class SortById implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
	if(o1.getId() > (o2.getId()))
			{
		return 1;
			}
	else if ((o1.getId()) == (o2.getId()))
	{
		return 0;
		}
	else {
		
		return -1;
	  }
	}
	}
	

class SortByName implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2)
	{
	return o1.getName().compareTo(o2.getName());	
	}
	
}
