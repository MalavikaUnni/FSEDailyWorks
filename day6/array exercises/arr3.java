/*Write a program in C to copy the elements of one array into another array.
Test Data : 
Input the number of elements to be stored in the array :3 
Input 3 elements in the array : 
element - 0 : 15 
element - 1 : 10 
element - 2 : 12 
Expected Output : 
The elements stored in the first array are : 
15 10 12 
The elements copied into the second array are : 
15 10 12 */

import java.io.*;
import java.util.*;
class arr3
{
	public static void main(String[] args)
{ 
    Scanner input = new Scanner(System.in);
    int arr1[],arr2[],size,i;
	System.out.print("Enter size: ");
	size = input.nextInt();
	arr1=new int[size];
	arr2=new int[size];
	System.out.print("Input elements in the array ");
	for(i=0; i<size; i++)
	{
		arr1[i]=input.nextInt();
		arr2[i]=arr1[i];
	}
	System.out.println("first array" +Arrays.toString(arr1));
	System.out.println("second array" +Arrays.toString(arr2));
}
}
	