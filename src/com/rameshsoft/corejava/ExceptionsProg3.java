package com.rameshsoft.corejava;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionsProg3 {
public static void main(String[] args) throws IOException {
	FileWriter fw = new FileWriter(new File("D:\\July9am2024\\secondapp456\\src\\com\\rameshsoft\\corejava\\hardwork.txt"));
	BufferedWriter bw = new BufferedWriter(fw);
	
	try(fw;bw)
	{
		System.out.println("try block");
		bw.write("java");
		bw.flush();
	}
	catch(Exception exception)
	{
		System.out.println("catch block");
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
