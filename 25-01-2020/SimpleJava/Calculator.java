//Java Program to Make a Simple Calculator Using switch...case
package com.cts.SimpleJava;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int number1,number2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		number1=Integer.parseInt(sc.nextLine());
		System.out.println("enter second number");
		number2=Integer.parseInt(sc.nextLine());
		int ch;
		System.out.println("Enter the operator");
		System.out.println("1.Add");
		System.out.println("2.Subtract");
		System.out.println("3.Multiply");
		System.out.println("4.Division");
		ch=Integer.parseInt(sc.nextLine());
		
		switch(ch)
		{
		case 1 : System.out.println(number1+number2); 
					break;
		case 2 : System.out.println(number1- number2);
					break;
		case 3 : System.out.println(number1*number2);
					break;
		case 4 : System.out.println(number1/number2);
					break;
		}

	}

}
