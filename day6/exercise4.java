//Consider an example, where the discount percentage on a TV needs to be decided
//  on the basis of the type of TV. If the TV is CRT (C), the discount will be 5% of the
//selling price (SP). If the TV is LCD (L), then the discount will depend on the size of
//the TV screen. For 14 inches screen, the discount is 8% of the SP. For 21 inches
//screen, the discount is 10% of the SP.


import java.io.*;
import java.util.*;
class exercise4
{
	public static void main(String[] args)
{ 
    double tot,sp;
	Scanner input = new Scanner(System.in);
	System.out.println("Available products : CRT (C) , LCD (L)  ");
    System.out.print("Enter product name: ");
    String name = input.nextLine();
	if(name.equals("C"))
	{    
        sp=20000;
		System.out.println("Selling price = 20000");
		tot=sp-(sp*0.05);
		System.out.println("total after discount : " +tot);
	}
	if(name.equals("L"))
	{
		sp=30000;
		System.out.println("Enter size 14 or 21?");
		int size = input.nextInt();
		if(size==14)
		{
			tot=sp-(sp*0.08);
			System.out.println("total after discount :" +tot);
		}
		else if(size==21)
		{
			tot=sp-(sp*0.1);
			System.out.println("total after discount : "+tot);
		}
		else
			System.out.println("invalid");
	}
}
}