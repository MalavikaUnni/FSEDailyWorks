package com.cts.SimpleJava;

import java.util.Scanner;

public class Evenorodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int number=Integer.parseInt(sc.nextLine());
		if(number%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("odd");
		}
	}

}
