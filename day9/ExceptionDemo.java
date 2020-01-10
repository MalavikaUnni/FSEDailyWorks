package com.cts.day9;
import java.util.Scanner;


public class ExceptionDemo {

	//public static void main(String [] args)
	public void logic() throws NullPointerException,ArithmeticException 
	{
			System.out.println("begin");
			Scanner sc=new Scanner(System.in);
			int a=Integer.parseInt(sc.nextLine());
			System.out.println("got value from the user");
			if(a==10)
			{
				throw new ArithmeticException("This is an Exception");
			}
			int b=10/(10-a);
			System.out.println("b= "+b);
			String name="Aniket";
			name=null;
			System.out.println("height "+name.length());
			System.out.println("end");
		}
	 public static void main(String[] args)
	 {
		 ExceptionDemo exd=new ExceptionDemo();
       try {
    	   exd.logic();
       }

       catch(Exception ex)
       {
	    System.out.println(ex.getMessage());

       }
      finally
      {
	   System.out.println("Resources");
      }
	}
}