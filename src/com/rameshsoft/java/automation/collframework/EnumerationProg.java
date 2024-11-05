package com.rameshsoft.java.automation.collframework;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationProg {
public static void main(String[] args) {
	
	Vector vector = new Vector();
	
	vector.add(456);
	vector.add(91456);
	vector.add(91456);
	vector.add(456);
	vector.add(456456);
	
	Enumeration enu = vector.elements();
	
	while(enu.hasMoreElements())
	{
		Object obj = enu.nextElement();
		int i = (int) obj;
		if (i == 456) {
			System.out.println("  Hello");
		}
		System.out.println(i);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
