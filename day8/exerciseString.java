package com.cts.day6;
import java.lang.*;
import java.util.Scanner;

public class exerciseString 
{

	public static void main(String [] args)
	{
	
		String courses=new String("1.java-5000 2.c-3000 3.C++-2000 4.python-10000 5.angular-20000 ");
		int price=0;
		System.out.println(courses);
		StringBuffer sb= new StringBuffer();
		Scanner sc= new Scanner(System.in);
		String choice=sc.nextLine();
		//String [] course= courses.split(" ");
		if(choice.contains("java"))
		{
			sb.append(" java  5000\n");
			price=price+5000;
		
		}
		if(choice.contains("c"))
		{
			sb.append(" c  3000\n");
			price=price+3000;
		
		}
		if(choice.contains("c++"))
		{
			sb.append(" c++ 2000\n");
			price=price+2000;
		
		}
		if(choice.contains("python"))
		{
			sb.append(" python  10000\n");
			price=price+10000;
		
		}
		if(choice.contains("angular"))
		{
			sb.append(" angular  20000\n");
			price=price+20000;
		
		}
		
		System.out.println(sb);
		System.out.println("total price : " +price);
		
	   
	}
}


