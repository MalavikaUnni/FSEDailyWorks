package com.cts.constructor;

public class ConstructorDemo {
	public static void main(String [] args)
	{
		Human human = new Human();
		Human h=new Human(2,3);
		h.display();
	}

}


class Human
{
	int a,b; //instance variables
	public Human()
	{
		System.out.println("automatically");
	}
	/*Human(int x, int y)
	{
		a=x;
		b=y;
		System.out.println("parameterised");
	}*/
	Human(int a, int b)
	{
		a=this.a;
		this.b=b;
		System.out.println("parameterised");
	}
	public void display()
	{
		System.out.println("a=" +a+ " b=" +b);
	}
}