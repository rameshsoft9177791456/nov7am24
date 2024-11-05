package com.rameshsoft.corejava;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class IoPackageFiles {
public static void main(String[] args) throws IOException {
	
	File file = new File("D:\\July9am2024\\secondapp\\src\\com\\rameshsoft\\corejava\\hardwork.txt");
	
	boolean status = file.createNewFile();
	
	if (status) {
		System.out.println("File is created newly!");
	}
	else {
		System.out.println("Returns existing file!");
	}
	
	//FileWriter fileWriter = new FileWriter(file);
	FileWriter fileWriter = new FileWriter(file, true);
	BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
	
	bufferedWriter.write("java");
	bufferedWriter.newLine();
	bufferedWriter.write("selenium");
	bufferedWriter.newLine();
	bufferedWriter.write("practice");
	bufferedWriter.newLine();
	bufferedWriter.write("hardwork");
	bufferedWriter.newLine();
	bufferedWriter.write("job");
	bufferedWriter.newLine();
	
	bufferedWriter.flush();
	fileWriter.close();
	bufferedWriter.close();
	
	
	
}
}
