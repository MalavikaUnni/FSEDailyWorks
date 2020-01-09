package com.cts.oops;

public class Area2 {
	public static void main(String [] args)
	{
		Area a= new Area();
		a.area(2,2);
	}
}
class Area
{
	public static final double Pi=3.14;
	public void area(double a)
	{
		System.out.println("area of square" +(a*a));
	
	}
	public void area(double a,double b)
	{
		System.out.println("area of rectangle" +(a*b));
	
	}
	public void area(int a,float b)
	{
		System.out.println("area of triangle" +((a*a)/2));
	
	}
	public void area(int a)
	{
		System.out.println("area of circle" +(Pi*a*a));
	
	}
	

}