/*Write a program in C to find the second largest element in an array.
Test Data : 
Input the size of array : 5 
Input 5 elements in the array : 
element - 0 : 2 
element - 1 : 9 
element - 2 : 1 
element - 3 : 4 
element - 4 : 6 
Expected Output : 
The Second largest element in the array is : 6 */

import java.io.*;
import java.util.*;
class arr8
{
	public static void main(String[] args)
{ 
    Scanner input = new Scanner(System.in);
    int arr[],size,maximum,secondmax;
	System.out.print("Enter size: ");
	size = input.nextInt();
	arr=new int[size];
	
	System.out.print("Input elements in the array ");
	for(int i=0; i<size; i++)
	{
		arr[i]=input.nextInt();
	}
	maximum=arr[0];
	//secondmax=arr[0];
	for(int i=0; i<size; i++)
	{
		if(arr[i]>maximum)
		{
			maximum=arr[i];
		}
	}
	for(int i=0;i<size;i++)
	{
		if(arr[i]<maximum && arr[i]>secondmax)
		{
			secondmax=arr[i];
		}
	}
	System.out.println("second maximum : "+secondmax);
}
}