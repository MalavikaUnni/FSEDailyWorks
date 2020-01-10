package com.cts.day9;

public class AnonymousAbstractDemo 
	{
	public static void main(String [] args)
	{
		TestAbst t=new TestAbst()
				{
			public void display()
			{
				System.out.println("good morning");
			}
				};
		t.display();
	}

}

abstract class TestAbst
{
	abstract public void display();
	/*{
		System.out.println("hello");
	}*/
}

