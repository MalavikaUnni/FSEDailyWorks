package com.cts.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderWriterDemo {
 public static void mian(String [] args) throws IOException, FileNotFoundException
 {
	 String path="C:\\Users\\Lenovo\\Desktop\\javaaa\\data.txt";
	 FileReader fin=new FileReader(path);
	 BufferedReader bufferedreader=new BufferedReader(fin);
	 FileWriter fout =new FileWriter("sample.txt");
	 BufferedWriter bufferedwriter=new BufferedWriter(fout);
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
