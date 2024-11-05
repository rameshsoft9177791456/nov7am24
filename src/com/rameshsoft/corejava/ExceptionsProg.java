package com.rameshsoft.corejava;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionsProg {
public static void main(String[] args) throws IOException {
	
	FileWriter fw = null;
	BufferedWriter bw = null;
	
	try
	{
		System.out.println("try block");
		fw = new FileWriter(new File("D:\\July9am2024\\secondapp456\\src\\com\\rameshsoft\\corejava\\hardwork.txt"));
		bw = new BufferedWriter(fw);
	}
	catch(Exception exception)
	{
		System.out.println("catch block");
	}
	finally
	{
		System.out.println("finally block");
		if (bw!=null) {
			bw.close();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*try
	{
		System.out.println("try block");
		FileInputStream fip = new FileInputStream("D:\\July9am2024\\secondapp\\src\\com\\rameshsoft\\corejava\\hardwork456.txt");
	}
	catch(FileNotFoundException fnfe)
	{
		System.out.println("FNFE");
	}
	catch(Exception exception)
	{
		System.out.println("catch block");
		exception.printStackTrace();
		//System.out.println(exception.toString());
		//System.out.println(exception.getMessage());
	}*/
	
	
	
	
}
}
