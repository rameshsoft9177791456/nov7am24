package com.rameshsoft.java.automation.collframework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IteratorProg {
public static void main(String[] args) {
	
	/*List list = new ArrayList<>();
	list.add("java");
	list.add("job");
	list.add("java");
	list.add("hardwork");
	list.add("hardwork");
	list.add("java");*/
	
	Set set = new HashSet<>();
	set.add("java");
	set.add("job");
	set.add("java");
	set.add("hardwork");
	set.add("hardwork");
	set.add("java");
	
	Iterator itr = set.iterator();
	
	while(itr.hasNext())
	{
		Object obj = itr.next();
		String str = (String) obj;
		if (str.equalsIgnoreCase("hardwork")) {
			System.out.println(" JOBS");
		}
		System.out.println(str);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
