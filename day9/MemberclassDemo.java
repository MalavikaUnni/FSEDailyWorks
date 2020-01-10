package com.cts.day9;

public class MemberclassDemo {
	public static void main(String [] args)
	{
		Outer outer=new Outer();
		outer.display();
	}

}

class Outer
{
	int x=10;
	static int y=20;
	public void display()
	{
		
		class Member
		{
			public void show()
			{
				System.out.println(x);
				System.out.println(y);
			}
			class Member2
			{
			   public void show2()
			   {
				   System.out.println("hi");
			   }
			}
		}
		Member m=new Member();
		m.show();
	}
}
