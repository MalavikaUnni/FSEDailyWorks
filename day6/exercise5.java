import java.io.*;
import java.util.*;
class exercise5
{
	public static void main(String[] args)
{ 
	Scanner input = new Scanner(System.in);
	System.out.print("Enter score for test 1: ");
    int score1 = input.nextInt();
	System.out.print("Enter score for test2: ");
    int score2 = input.nextInt();
	if(score1>=75 && score2>=75)
	{
		int avg=((score1+score2)/2);
		if(avg>=80)
		{
			System.out.println("You are Selected for the Interview");
		}
		else
		{
			System.out.println("Sorry ! Not Selected");
		}
	}
	else
	{
		System.out.println("Sorry ! Not selected");
	}
}
}
	