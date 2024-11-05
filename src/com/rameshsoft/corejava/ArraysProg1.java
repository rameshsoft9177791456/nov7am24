package com.rameshsoft.corejava;

public class ArraysProg1 {
public static void main(String[] args) {
	
	String[][] str = new String[2][2];
	
	str[0][0] = "java";
	str[0][1] = "selenium";
	str[1][0] = "hardwork";
	str[1][1] = "job";
	
	for(int i=0; i<str.length; i++)
	{
		for(int j=0; j<str.length; j++)
		{
			System.out.println(str[i][j]);
		}
	}
	
	int[][] td = {{456,91456},{56,456}};
	
	for(int i=0; i<td.length; i++)
	{
		for(int j=0; j<td.length; j++)
		{
			System.out.println(str[i][j]);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
