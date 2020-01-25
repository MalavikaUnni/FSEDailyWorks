package com.cts.JavaAssignment1;

import java.util.Scanner;

public class Assignment1 {
	public static void main(String [] args)
	{
		String name;
		long year;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name");
		name=sc.nextLine();
		System.out.println("Enter year");
		year=Integer.parseInt(sc.nextLine());
		System.out.println("Name :" +name+ "\t Year :" +year);
	}

}
