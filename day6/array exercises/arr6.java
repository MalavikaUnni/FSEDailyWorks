/* Write a program in C to separate odd and even integers in separate arrays.
Test Data : 
Input the number of elements to be stored in the array :5 
Input 5 elements in the array : 
element - 0 : 25 
element - 1 : 47 
element - 2 : 42 
element - 3 : 56 
element - 4 : 32 
Expected Output : 
The Even elements are : 
42 56 32 
The Odd elements are : 
25 47*/

import java.io.*;
import java.util.*;
class arr6
{
	public static void main(String[] args)
{ 
    Scanner input = new Scanner(System.in);
    int arr[],even,odd,size,i;
	System.out.print("Enter size: ");
	size = input.nextInt();
	arr=new int[size];
	System.out.print("Input elements in the array ");
	for(i=0; i<size; i++)
	{
		arr[i]=input.nextInt();
	}
	System.out.println("Even");
	for(i=0;i<size;i++)
	{
		if(arr[i]%2==0)
		{
			
			even=arr[i];
			System.out.println(even);
			
		}
	}
	System.out.println("odd");
	for(i=0; i<size; i++)
	{
		if(arr[i]%2!=0)
		{
			
			odd=arr[i];
			System.out.println(odd);
			
		}
		
		
	}

}
}