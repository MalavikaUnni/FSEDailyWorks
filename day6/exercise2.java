import java.io.*;
import java.util.*;
class exercise2
{
	public static int area(int l, int b)
{
	int area=l*b;
	return area;
}

public static int perimeter(int l,int b)
{
	int perimeter=2*(l+b);
	return perimeter;
}
public static void main(String[] args)
{
    Scanner input = new Scanner(System.in);
    System.out.print("Enter length: ");
    int length = input.nextInt();
	System.out.print("Enter breadth: ");
    int breadth = input.nextInt();
	int c= area(length,breadth);
	System.out.println("area :" +c);
	int d= perimeter(length,breadth);
	System.out.println("perimeter :" +d);
}

}