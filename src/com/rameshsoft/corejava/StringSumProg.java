package com.rameshsoft.corejava;

public class StringSumProg {
public static void main(String[] args) {
	
	String str = "java456";
	
	int sum = 0;
	
	for(int i=0; i<str.length(); i++)
	{
		char ch = str.charAt(i);
		boolean b = Character.isDigit(ch); //'6'
		if (b) {
			int val = Character.getNumericValue(str.charAt(i)); //6
			sum = sum + val; //9 + 6
		}
	}
	
	System.out.println("SUM is: "+sum);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
