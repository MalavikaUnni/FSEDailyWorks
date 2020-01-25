package com.cts.SimpleJava;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first,second,third;
		first=0;
		second=1;
		third=first+second;
		Scanner sc=new Scanner(System.in);
		int limit=Integer.parseInt(sc.nextLine());
		System.out.println(first);
		System.out.println(second);
		for(int i=2;i<limit;i++)
		{
			first=second;
			second=third;
			third=first+second;
			System.out.println(third);
		}

	}

}
