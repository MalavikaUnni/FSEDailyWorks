package com.cts.main;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;


public class FileHandlingDemo1 {
	//Read data from one file and write it into another file
	public static void main(String [] args) throws IOException, FileNotFoundException
	{
	String path="C:\\Users\\Lenovo\\Desktop\\javaaa\\data.txt"; //Absolute path
	//File file=new File(path);
	FileInputStream fin=new FileInputStream(path);
	FileOutputStream fout=new FileOutputStream("copied.txt"); //Relative path
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