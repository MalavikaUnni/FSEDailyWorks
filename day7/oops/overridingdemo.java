package com.cts.oops;

public class overridingdemo {
	public static void main( String[] args) {
		Emp emp=new Emp();
		emp.display();//static binding
		Man man=new Man();
		man.display();//static binding
		Emp emp2 = new Man(); //Dynamic binding(runtime polymorphism)
		emp2.display();
	}
}
class Emp
{
	 void display()
	{
		System.out.println("Employee class");
	}
}
class Man extends Emp
{
	 void display()
	{
		System.out.println("Manager class");
	}
}
