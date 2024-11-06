package com.rameshsoft.java.automation.collframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionsProg {
public static void main(String[] args) {
	
	List list = new ArrayList();
	list.add("java");
	list.add("selenium");
	list.add("job");
	list.add("hardwork");
	list.add("practice");
	list.add("java");
	
	
	for(Object obj : list)
	{
		String str = (String) obj;
		System.out.println(str);
	}
	
	/*Iterator itr = list.iterator();
	
	while(itr.hasNext())
	{
		Object obj = itr.next();
		String str = (String) obj;
		System.out.println(str);
	}
	*/
	
	
	
	
	
	
	
	
	
	
	
}
}
