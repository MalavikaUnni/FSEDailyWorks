package com.cts.day6;

class finalDemo 
{
		 
	   public static void main(String [] args)
	   {
			 X x1=new X();
			 X x2=new X(20);
			 System.out.println(x1.PI);
			 
	 	
	
	 	//System.out.println(
	   }
}

class X
{
	public final double PI;
	public X()
	{
		PI=4.5;
	}
	public X(int a)
	{
		PI=5.5;
	}
}
