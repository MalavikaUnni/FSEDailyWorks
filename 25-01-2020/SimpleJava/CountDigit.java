//Java Program to Count Number of Digits in an Integer

package com.cts.SimpleJava;

import java.util.Scanner;

public class CountDigit {

	public static void main(String[] args) {
		int number,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an Integer");
		number= Integer.parseInt(sc.nextLine());
		while(number!=0)
		{
			number=number/10;
			count++;
		}
		
		System.out.println(count);
	}

}
