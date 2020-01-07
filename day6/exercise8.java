import java.io.*;
import java.util.*;
class exercise8
{
	public static void main(String[] args)
{ 
    double tot;
	Scanner input = new Scanner(System.in);
	System.out.print("Enter age: ");
    int age = input.nextInt();
	if(age<5)
	{
		System.out.println("Baby");
	}
	if (age>=5 && age<=12)
	{
		System.out.println("Children");
	}
	if(age>=13 && age <=19)
	{
		System.out.println("Teenagers");
	}
	if(age>=20 && age <=35)
	{
		System.out.println("Young adults");
	}
	if(age>=36 && age <=45)
	{
		System.out.println("mature adults");
	}
	if(age>=46 && age <=55)
	{
		System.out.println("elders");
	}
	if(age>=56 && age <=100)
	{
		System.out.println("seniors");
	}
}
}