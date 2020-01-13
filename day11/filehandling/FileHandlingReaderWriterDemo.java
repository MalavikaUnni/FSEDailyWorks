package com.cts.main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingReaderWriterDemo {
	public static void main(String [] args) throws IOException, FileNotFoundException
	{
		String path="C:\\Users\\Lenovo\\Desktop\\javaaa\\data.txt";
		FileReader fin=new FileReader(path);
		FileWriter fout=new FileWriter("neww.txt");

		/*Scanner sc=new Scanner(System.in);
		 String message=sc.nextLine();
		 for (int i = 0; i < message.length(); i++) 
	            {
			 fout.write(message.charAt(i)); 
	            }*/
		
		int i;
		while((i=fin.read()) != -1)
		{
			fout.write(i);
			System.out.println((char)i);
		}
		
		 
		 fout.close();
		 fin.close();
		 
	}

}
