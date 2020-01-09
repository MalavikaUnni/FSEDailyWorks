/*The management of LearnMore University is planning to automate the University management system. 
 * Therefore, Steve Wilkinson, the programmer, has decided to create a Java program that accepts the student details,
 *  such as the first name, last name, age, course enrolled, and student ID. 
 *  In addition, he also needs to accept the employee details, such as first name, last name, age, salary,
 *   department name, designation, and employee ID. Steve must ensure the reusability of code.
 *    The program must offer a choice to accept either the student's or employee's details. 
 *    Help Steve to develop the program. */

package com.cts.day6;

import java.util.Scanner;

public class university {
	public static void main(String [] args)
	{   
		Scanner sc=new Scanner(System.in);
		Name name=new Name();
		Student student=new Student();
		Employee employee=new Employee();
		System.out.println("1.Student 2.Employee");
		int choice=sc.nextInt();
		if(choice==1)
		{    
			name.getDet();
			student.getstud();
			student.showstud();
		}
		if(choice==2)
		{  
			name.getDet();
			employee.getemp();
			employee.showemp();
		}
	}

}

class Name
{
	String firstName;
	String lastName;
	int age;
	
	
	public void getDet()
	{   
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first name");
		firstName=sc.nextLine();
		System.out.println("enter last name");
		lastName=sc.nextLine();
		System.out.println("enter age");
		age=Integer.parseInt(sc.nextLine());
		
	}
	
}
class Student extends Name
{
	String course;
	int stdid;
	
	public void getstud()
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter course");
	    course=sc.nextLine();
	    System.out.println("enter stdid");
	    stdid=Integer.parseInt(sc.nextLine());
	}
	public void showstud()
	{
		System.out.println("Details" +firstName+ " " +lastName+ " " +age+ " " +course+ " " +stdid);
	}
}

class Employee extends Name
{
	long salary;
	String dept;
	String desig;
	int empid;
	
	public void getemp()
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter salary");
	    salary=Integer.parseInt(sc.nextLine());
	    System.out.println("enter department");
	    dept=sc.nextLine();
	    System.out.println("enter desig");
	    desig=sc.nextLine();
	    System.out.println("enter empid");
	    empid=Integer.parseInt(sc.nextLine());
		
	}
	
	public void showemp()
	{
		System.out.println("details" +firstName+ " " +lastName+ " " +age+ " " +salary+ " " +dept+ " " +desig+ " " +empid);
	}
}




