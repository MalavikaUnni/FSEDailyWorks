package com.cts.training.nio;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class BasicOperations {
	public static void main(String [] args) throws IOException
	{
		//Path interface, which is used to craete a Path
		
		FileSystem fs=FileSystems.getDefault();
		//Path path=fs.getPath("C:/Users/Lenovo/Desktop/javaaa");
		//OR
		//Path path=fs.getPath("C:","Users","Lenovo","Desktop","javaaa");
		//OR
		/*Path path=Paths.get("C:","Users","Lenovo","Desktop","javaaa");
		 System.out.println("Name Count :" +path.getNameCount());
		 System.out.println("Is Absolute :"+path.isAbsolute());
		System.out.println("Name on Index 2 :"+path.getName(2)); */
        //Path path1=Paths.get("C:/Users/Lenovo/Desktop/javaaa");
        //Path path=Files.createFile(path1.resolve("Sample2.txt"));
		Path path1=Paths.get("C:/Users/Lenovo/Desktop/javaaa");
		//Path path=Files.createDirectory(path1.re, attrs)
		//Files.createDirectory(path);
		//Files.createDirectories(dir, attrs)
		
		
		
		
		
	}

	
}
