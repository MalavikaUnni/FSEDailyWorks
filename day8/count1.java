package com.cts.day6;

import java.util.Scanner;

public class count1 {
	public static void main(String [] ags)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter lower limit");
		int lower=Integer.parseInt(sc.nextLine());
		System.out.println("enter lower limit");
	    int upper=Integer.parseInt(sc.nextLine());	
	    Number number=new Number();
	    int s=number.num(lower,upper);
	    System.out.println("count=" +s);
	    
	}

}

class Number
{
	int count=0;
	public int num(int l,int u)
	{   
		for(int i=l;i<=u;i++)
		{
			int num=i;
			while(num!=0)
			{
				int p=num%10;
				num=num/10;
				if(p==1) 
				{
					count+=1;
				}
			}
	   }
		return count;
    }
}
