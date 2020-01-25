package com.cts.SimpleJava;

import java.util.Scanner;

public class StringReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String Reversal
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String sentence = sc.nextLine();
        String reversed1 = reverse(sentence);
        System.out.println("The reversed sentence is: " + reversed1);
	}
           
	     public static String reverse(String sentence)
            {
                if (sentence.isEmpty())
                    return sentence;
                return reverse(sentence.substring(1)) + sentence.charAt(0);
            }
        
	}


