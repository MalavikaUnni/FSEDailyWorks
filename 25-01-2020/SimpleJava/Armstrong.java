package com.cts.SimpleJava;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range");
		int start=Integer.parseInt(sc.nextLine());
		int end=Integer.parseInt(sc.nextLine());
		int counter=0,rem;
		for(int i=start+1; i<end; i++)
		{
		   int temp = i;
		   int num = 0;
		   while(temp != 0)
		   {
			rem = temp%10;
			num = num + rem*rem*rem;
			temp = temp/10;
		   }
		   if(i == num)
		   {
			if(counter == 0)
			{
			   System.out.print("Armstrong Numbers Between "+start+" and "+end+": ");
			}
			   System.out.print(i + "  ");
			   counter++;
		   }
		}
//		if(counter == 0)
//		{
//		   System.out.print("There is no Armstrong number Between "+start+" and "+end);
//		}
	    }
	}
	
