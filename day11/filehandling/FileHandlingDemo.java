package com.cts.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingDemo {

	public static void main(String [] args) throws IOException, FileNotFoundException
	{
		String path="C:\\Users\\Lenovo\\Desktop\\javaaa\\data.txt";
	 //FileOutputStream fout= new FileOutputStream(path);
	 File file=new File(path);
	 System.out.println("Can Execute? :"+file.canExecute());
	 System.out.println("Can Read ? : "+file.canRead());
	 System.out.println("Can write ? :"+ file.canWrite());
	 System.out.println("File exist? : "+file.exists());
	 System.out.println("Absolute path :" + file.getAbsolutePath());
	 System.out.println("File Name  : "+file.getName());
	 System.out.println("Write Data :");
	 FileOutputStream fout=new FileOutputStream(file,true);
	 
	 Scanner sc=new Scanner(System.in);
	 String message=sc.nextLine();
	 //String message ="First Program";
	 byte [] b=message.getBytes();
	 fout.write(b);
	 fout.close();
		
	}
}
