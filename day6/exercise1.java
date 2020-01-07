//Write a Program that accepts a number and checks whether it's positive, negative, or zero.


import java.io.*;
import java.util.*;
class exercise1
{
public static void main(String[] args)
{
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = input.nextInt();
	if(number>0)
	{
	System.out.println("positive number");
	}
	else if(number<0)
	{
		System.out.println("negative nyumber");
	}
	else
	{
		System.out.println("zero");
	}
	
}
}