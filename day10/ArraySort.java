package com.cts.day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraySort {
	public static void main(String [] args)
	{
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(12,4,22,67,15,8));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		
	}

}
