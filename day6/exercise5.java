/* Consider a scenario where all candidates have to take two tests before appearing for an
interview. A candidate is selected for the interview round, based on the scores of the two
   tests. The individual score in each test should be greater than 75, and the average
   score for the two tests should be a minimum of 80. A call letter for the interview is to
   be sent to candidates who have been selected, and a rejection letter is to be sent to
   the rest. */

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
	