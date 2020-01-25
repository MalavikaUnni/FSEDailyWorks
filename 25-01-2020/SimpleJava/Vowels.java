package com.cts.SimpleJava;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String");
	String string=sc.nextLine();
	int count=0;
   for(int j=0;j<string.length();j++)
   {
	   if(string.charAt(j)=='a' | string.charAt(j)=='e'| string.charAt(j)=='i' |string.charAt(j)=='o' | string.charAt(j)=='u')
	   {
		   System.out.println(string.charAt(j));
		count++;   
	   }
   }
   System.out.println("Vowel Count :" +count);
	
	}

}
