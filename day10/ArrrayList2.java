package com.cts.day10;

import java.util.ArrayList;
import java.util.Collections;

public class ArrrayList2 {
  
	public static void main(String[] args)
	{
		ArrayList<Employee> list=new ArrayList<Employee>();
		Employee emp1=new Employee(109,"Abin","Hyderabad",22,846545L,246567);
		Employee emp2=new Employee(106,"Anu","Chennai",21,8434555L,246467);
		Employee emp3=new Employee(103,"Tanu","Delhi",23,23456785L,246726);
		Employee emp4=new Employee(104,"Prudhvi","Banglore",19,23456789L,988760);
		Employee emp5=new Employee(105,"Aniket","Mumabi",24,99777344L,136489);
		
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
	
		//System.out.println(list);
		//Collections.sort(list);
		SortById sbi =new SortById();
		Collections.sort(list,sbi);
		//Collections.sort(list,new SortByName());
		
	for(Employee employee : list)
	{
		System.out.println(employee);
	}
		
	}
	
}
