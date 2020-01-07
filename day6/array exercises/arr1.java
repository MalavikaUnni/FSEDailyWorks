/* Write a program in C to read n number of values in an array and display it in reverse order
Test Data : 
Input the number of elements to store in the array :3 
Input 3 number of elements in the array : 
element - 0 : 2 
element - 1 : 5 
element - 2 : 7
Expected Output : 
The values store into the array are : 
2 5 7 
The values store into the array in reverse are : 
7 5 2 */

import java.io.*;
import java.util.*;
class arr1
{
	public static void main(String[] args)
{ 
    Scanner input = new Scanner(System.in);
    int arr[],size,i;
	System.out.print("Enter size: ");
	size = input.nextInt();
	arr=new int[size];
	
	System.out.print("Input elements in the array ");
	for(i=0; i<size; i++)
	{
		arr[i]=input.nextInt();
	}
	System.out.println(" the values store into the array are : ");

	System.out.println(Arrays.toString(arr));
	for(i=size-1;i>=0;i--)
	{
		System.out.println(arr[i]);
	}

}
}