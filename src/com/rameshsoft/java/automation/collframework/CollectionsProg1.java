package com.rameshsoft.java.automation.collframework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionsProg1 {
public static void main(String[] args) {
	
	List list = new ArrayList();
	list.add("java");
	list.add("java");
	list.add("java");
	list.add(456);
	list.add(456);
	list.add(456);
	list.add("selenium");
	list.add("selenium");
	list.add("job");
	list.add("job");
	list.add("selenium");
	System.out.println(list);
	
	//Set set = new HashSet(list);
	//System.out.println(set);
	
	//Set set = new HashSet();
	//set.addAll(list);
	//System.out.println(set);
	
	/*Set set = new HashSet();
	
	for(int i=0; i<list.size(); i++)
	{
		Object obj = list.get(i);
		set.add(obj);
	}
	
	System.out.println(set);*/
	
	
	Set set = new HashSet();
	List dup = new ArrayList();
	
	for(int i=0; i<list.size(); i++)
	{
		Object obj = list.get(i);
		boolean status = set.add(obj);
		if (status) {
			;;;;;
		}
		else {
			dup.add(obj);
		}
	}
	
	System.out.println("After removal elements are: "+set);
	System.out.println("Removed duplicate elements are: "+dup);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
