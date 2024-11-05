package com.rameshsoft.corejava;

public class StringRevProg {
public static void main(String[] args) {
	
	String str = "java adp";
	
	String reverse = "";//p
	
	for(int i=str.length()-1; i>=0; i--)
	{
		reverse = reverse + str.charAt(i); //"pda a"+a
	}
	
	System.out.println("Reverse of the string is: "+reverse);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*StringBuilder sb = new StringBuilder(str);
	sb = sb.reverse();
	System.out.println(sb);*/
	
}
}
