//Write a Program to accept three numbers and to display the largest of the three numbers.

import java.io.*;
import java.util.*;
class exercise7
{
	public static void main(String[] args)
{ 
    double tot;
	Scanner input = new Scanner(System.in);
	System.out.print("Enter first: ");
    int first = input.nextInt();
	System.out.print("Enter second: ");
    int second = input.nextInt();
	System.out.print("Enter third: ");
    int third = input.nextInt();
	if(first>second && first>third)
	{
		System.out.println("First is  greater" +first);
	}
	else if(second>first && second>third)
	{
		System.out.println("second is greater" +second);
	}
	else
	{
		System.out.println("Third is greater" +third);
	}
	
}
}