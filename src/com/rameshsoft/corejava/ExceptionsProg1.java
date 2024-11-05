package com.rameshsoft.corejava;

public class ExceptionsProg1 {
public static void main(String[] args) {
	System.out.println("1");
	System.out.println("2");
	try
	{
		System.out.println(10/0);
		
	}
	catch(Exception exception)
	{
		System.out.println("catch block");
	}
	System.out.println("3");
	System.out.println("4");
	
}
}
