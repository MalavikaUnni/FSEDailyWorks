/*Write a program in C to find the sum of all elements of the array.
Test Data : 
Input the number of elements to be stored in the array :3 
Input 3 elements in the array : 
element - 0 : 2 
element - 1 : 5 
element - 2 : 8 
Expected Output : 
Sum of all elements stored in the array is : 15 */

import java.io.*;
import java.util.*;
class arr2
{
	public static void main(String[] args)
{ 
    Scanner input = new Scanner(System.in);
    int arr[],size,i,s=0;
	System.out.print("Enter size: ");
	size = input.nextInt();
	arr=new int[size];
	
	System.out.print("Input elements in the array ");
	for(i=0; i<size; i++)
	{
		arr[i]=input.nextInt();
		s=s+arr[i];
	}
	

	System.out.println("Sum of  all elements stored in the array :"  +s);
}
}
	