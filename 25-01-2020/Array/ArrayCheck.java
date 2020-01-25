package com.cts.Array;

import java.util.Scanner;

public class ArrayCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] arr= {11,22,33,44,55,66,77,88,99};
     Scanner sc=new Scanner(System.in);
     int num=Integer.parseInt(sc.nextLine());
     for(int i=0;i<arr.length;i++)
     {
    	 if(arr[i]==num)
    		 System.out.println("Found at"+i);
     }
     
	}

}
