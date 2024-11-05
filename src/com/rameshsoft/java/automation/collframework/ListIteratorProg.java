package com.rameshsoft.java.automation.collframework;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorProg {
public static void main(String[] args) {
	
	List list = new ArrayList<>();
	list.add("java");
	list.add("job");
	list.add("java");
	list.add("hardwork");
	list.add("hardwork");
	list.add("java");
	
	ListIterator itr = list.listIterator();
	
	while(itr.hasNext())
	{
		Object obj = itr.next();
		String str = (String) obj;
		if (str.equalsIgnoreCase("hardwork")) {
			System.out.println("  JOB");
		}
		System.out.println(str);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
