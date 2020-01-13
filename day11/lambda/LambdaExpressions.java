package com.cts.training.lambda;

public class LambdaExpressions {

	public static void main(String [] args)
	{
		/*Hello h = () -> 
		{
			System.out.println("This is Lamba Expression");
			System.out.println("this is lambda");
		};
		h.display(); */
		
		/*Runnable r= () -> System.out.println("I am Runnable Interface");
		Thread t=new Thread(r);
		t.start(); */
		
		Hello h=(a,b)-> a+b;
		System.out.println(h.add(10, 20));
	}
}


@FunctionalInterface
interface Hello
{
	//public void display();
	public int add(int a, int b);
}