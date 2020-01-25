//Java Program to Check Whether a Number can be Expressed as Sum of Two Prime Numbers
package com.cts.SimpleJava;

import java.util.Scanner;

public class CheckSumPrime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number to check whether it can be Expressed as sum of two prime numbers");
		int number=Integer.parseInt(sc.nextLine());
		//int primearr[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 
				//43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
		boolean flag = false;
		for (int i = 2; i <= number / 2; ++i) {

		if (checkPrime(i)) {

		if (checkPrime(number - i)) {

		System.out.printf("%d can be expressed as the sum of %d and %d\n", number, i, number - i);
		flag = true;
		}

		}
		}

		if (!flag)
		System.out.println(number + " cannot be expressed as the sum of two prime numbers.");
	
		}
static boolean checkPrime(int number)
	{
		boolean flag1=true;
		for(int i=2;i<number/2;i++)
		{
			if(number%i==0)
			{
				flag1=false;
				break;
			}
		}
	return flag1;
	}
}