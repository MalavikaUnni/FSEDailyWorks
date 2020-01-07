//You have to write a Program that accepts the product name and quantity as input and displays the total price using the unit prices already stored in the system.

import java.io.*;
import java.util.*;
class exercise3
{
	public static void main(String[] args)
{ 
    int tot;
	Scanner input = new Scanner(System.in);
	System.out.println("Available products : Bread and jam");
    System.out.print("Enter product name: ");
    String name = input.nextLine();
	System.out.print("Enter quantity: ");
    int quantity = input.nextInt();
	if(name.equals("bread"))
	{
		tot=22*quantity;
		System.out.println("Total price : "+tot);
	}
	else if(name.equals("jam"))
	{
		tot=30*quantity;
		System.out.println("totatl price :" +tot);
	}
	else
	{
		System.out.println("Not available");
	}
}
}
	