package com.rameshsoft.corejava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class IoPkageReadProg {
public static void main(String[] args) throws IOException {
	
    File file = new File("D:\\July9am2024\\secondapp\\src\\com\\rameshsoft\\corejava\\hardwork.txt");
	
	boolean status = file.createNewFile();
	
	if (status) {
		System.out.println("File is created newly!");
	}
	else {
		System.out.println("Returns existing file!");
	}
	
	FileReader fileReader = new FileReader(file);
	BufferedReader bufferedReader = new BufferedReader(fileReader);
	
	
	while(bufferedReader.ready())
	{
		String data = bufferedReader.readLine();
		System.out.println(data);
	}
	
	fileReader.close();
	bufferedReader.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
