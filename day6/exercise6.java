/* Write a Program to accept hours and number of resources and display the total
   number of productive hours. (Total number of productive hours = hours * number of
   resources).*/


import java.io.*;
import java.util.*;
class exercise6
{
	public static void main(String[] args)
{ 
    double tot;
	Scanner input = new Scanner(System.in);
	System.out.print("Enter hours: ");
    int hours = input.nextInt();
	System.out.print("Enter nnumber of resources: ");
    int resources = input.nextInt();
	tot=hours*resources;
	System.out.println("total productive hourse : "+tot);
}
}