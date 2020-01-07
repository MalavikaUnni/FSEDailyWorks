/*Write a program in C to count a total number of duplicate elements in an array.
Test Data : 
Input the number of elements to be stored in the array :3 
Input 3 elements in the array : 
element - 0 : 5 
element - 1 : 1 
element -
Expected Output : 
Total number of duplicate elements found in the array is : 1 */

import java.io.*;
import java.util.*;
class arr4
{
	public static void main(String[] args)
{ 
    Scanner input = new Scanner(System.in);
    int arr[],size,i,j,count=0;
	System.out.print("Enter size: ");
	size = input.nextInt();
	arr=new int[size];
	
	System.out.print("Input elements in the array ");
	for(i=0; i<size; i++)
	{
		arr[i]=input.nextInt();
	}
	for(i=0; i<size; i++)
	{
		for(j=i+1; j<size; j++)
		{
			if(arr[i]==arr[j])
			{
				count++;
			}
		}
	}
	System.out.println("Duplicate elements count = " +count);
}
}