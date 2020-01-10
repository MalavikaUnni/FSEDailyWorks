package com.cts.day9;

public class InnerDemo {
	int x=10;
	static int y=20;
static class Inner
{
	public void display()
	{
		//System.out.println(x);
		System.out.println(y);
		
	}
}
}

class Main
{
	public static void main(String [] args)
	{
		InnerDemo.Inner inner=new InnerDemo.Inner();
		inner.display();
	}
}