package com.cts.day9;

public class AnonymousDemo {
	public static void main(String [] args)
	{
		Test t=new Test()
				{
			public void display()
			{
				System.out.println("good morning");
			}
				};
		t.display();
	}

}

class Test
{
	public void display()
	{
		System.out.println("hello");
	}
}
