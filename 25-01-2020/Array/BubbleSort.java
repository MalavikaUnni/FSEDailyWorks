package com.cts.Array;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
	int arr[]= {2,1,5,4,9,8};
	System.out.println("array Before BubbleSort");
    for(int i=0;i<arr.length;i++)
    {
    	System.out.println(Arrays.toString(arr));
    }
    
    System.out.println("array after Bubbloesort");
    Bubble(arr);
    for(int i=0;i<arr.length;i++)
    {
    	System.out.println(Arrays.toString(arr));
    }
	}

	
	static void Bubble(int arr[])
	{
		int arrLength=arr.length;
		int temp=0;
		for(int i=0;i<arrLength;i++)
		{
			for(int j=1;j<(arrLength-i);j++)
			{
				if(arr[j-1]>arr[j])
				{
				temp=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
			    }
		   }
		}
	}
	
}
