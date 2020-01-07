/*Write a program in C to find the maximum and minimum element in an array. 
Test Data : 
Input the number of elements to be stored in the array :3 
Input 3 elements in the array : 
element - 0 : 45 
element - 1 : 25 
element - 2 : 21 
Expected Output : 
Maximum element is : 45 
Minimum element is : 21 */

import java.io.*;
import java.util.*;
class arr5
{
	public static void main(String[] args)
{ 
    Scanner input = new Scanner(System.in);
    int arr[],size,i,large=0;
	System.out.print("Enter size: ");
	size = input.nextInt();
	arr=new int[size];
	
	System.out.print("Input elements in the array ");
	for(i=0; i<size; i++)
	{
		arr[i]=input.nextInt();
	}
	int min=arr[0];
	for(i=0;i<size;i++)
	{
		if(arr[i]<=min) {
				min=arr[i];
			}
	}
	for(i=0;i<size;i++)
	{ 
		if(arr[i]>=large)
		{
			large=arr[i];
			
		}
	}
	System.out.println("maximum : " +large);
	System.out.println("minimum : " +min);
}
}
			